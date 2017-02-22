package com.jme3.texture.image;

import java.nio.ByteBuffer;

import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.texture.Image;

public class ImageRasterParent extends ImageRaster {

	protected ByteBuffer buffer;
	protected int slice;
	protected final Image image;
	protected final int[] components = new int[4];
	protected final ImageCodec codec;
	
	public ImageRasterParent(Image image, ImageCodec codec) {
		this.image = image;
		this.codec = codec;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public void setPixel(int x, int y, ColorRGBA color) {
	}

	@Override
	public ColorRGBA getPixel(int x, int y, ColorRGBA store) {
		return null;
	}
	
	protected void setComponentArr(ColorRGBA color, ImageCodec codec, int[] components) {
		
		// Check flags for grayscale
        if (codec.isGray) {
            float gray = color.r * 0.27f + color.g * 0.67f + color.b * 0.06f;
            color = new ColorRGBA(gray, gray, gray, color.a);
        }
		
		switch (codec.type) {
            case ImageCodec.FLAG_F16:
                components[0] = (int) FastMath.convertFloatToHalf(color.a);
                components[1] = (int) FastMath.convertFloatToHalf(color.r);
                components[2] = (int) FastMath.convertFloatToHalf(color.g);
                components[3] = (int) FastMath.convertFloatToHalf(color.b);
                break;
            case ImageCodec.FLAG_F32:
                components[0] = (int) Float.floatToIntBits(color.a);
                components[1] = (int) Float.floatToIntBits(color.r);
                components[2] = (int) Float.floatToIntBits(color.g);
                components[3] = (int) Float.floatToIntBits(color.b);
                break;
            case 0:
                // Convert color to bits by multiplying by size
                components[0] = Math.min((int) (color.a * codec.maxAlpha + 0.5f), codec.maxAlpha);
                components[1] = Math.min((int) (color.r * codec.maxRed + 0.5f), codec.maxRed);
                components[2] = Math.min((int) (color.g * codec.maxGreen + 0.5f), codec.maxGreen);
                components[3] = Math.min((int) (color.b * codec.maxBlue + 0.5f), codec.maxBlue);
                break;
        }
	}
	
	protected ByteBuffer getBuffer() {
        if (buffer == null) {
            this.buffer = image.getData(slice);
        }
        return buffer;
    }
	
	public void setSlice(int slice) {
        this.slice = slice;
        this.buffer = image.getData(slice);
    }
	
	protected ColorRGBA setStore(ColorRGBA store, ImageCodec codec, int[] components) {
		if (store == null) {
            store = new ColorRGBA();
        }
        switch (codec.type) {
            case ImageCodec.FLAG_F16:
                store.set(FastMath.convertHalfToFloat((short) components[1]),
                        FastMath.convertHalfToFloat((short) components[2]),
                        FastMath.convertHalfToFloat((short) components[3]),
                        FastMath.convertHalfToFloat((short) components[0]));
                break;
            case ImageCodec.FLAG_F32:
                store.set(Float.intBitsToFloat((int) components[1]),
                        Float.intBitsToFloat((int) components[2]),
                        Float.intBitsToFloat((int) components[3]),
                        Float.intBitsToFloat((int) components[0]));
                break;
            case 0:
                // Convert to float and divide by bitsize to get into range 0.0 - 1.0.
                store.set((float) components[1] / codec.maxRed,
                        (float) components[2] / codec.maxGreen,
                        (float) components[3] / codec.maxBlue,
                        (float) components[0] / codec.maxAlpha);
                break;
        }
        if (codec.isGray) {
            store.g = store.b = store.r;
        } else {
            if (codec.maxRed == 0) {
                store.r = 1;
            }
            if (codec.maxGreen == 0) {
                store.g = 1;
            }
            if (codec.maxBlue == 0) {
                store.b = 1;
            }
            if (codec.maxAlpha == 0) {
                store.a = 1;
            }
        }
		return store;
	}

	protected void rangeCheck(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            throw new IllegalArgumentException("x and y must be inside the image dimensions:" 
                                                + x + ", " + y + " in:" + getWidth() + ", " + getHeight());
        }
    }
	
	protected ColorRGBA getPixelStore(int x, int y, ColorRGBA store) {
		rangeCheck(x, y);

        codec.readComponents(getBuffer(), x, y, getWidth(), getOffset(), components, getTemp());
        store = setStore(store, codec, components);
		return store;
	}
	
	public int getOffset() {
		return 0;
	}
	
	public byte[] getTemp() {
		return null;
	}
}
