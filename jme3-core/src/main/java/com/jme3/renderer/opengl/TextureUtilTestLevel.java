package com.jme3.renderer.opengl;

import java.nio.ByteBuffer;

public class TextureUtilTestLevel {

	private GLImageFormat format;
	private TextureUtilTestValues values;
	private ByteBuffer data;
	
	public TextureUtilTestLevel() {
		// TODO Auto-generated constructor stub
	}
	
	

	public TextureUtilTestLevel(GLImageFormat format, TextureUtilTestValues values, ByteBuffer data) {
		super();
		this.format = format;
		this.values = values;
		this.data = data;
	}



	public GLImageFormat getFormat() {
		return format;
	}

	public void setFormat(GLImageFormat format) {
		this.format = format;
	}

	public ByteBuffer getData() {
		return data;
	}

	public void setData(ByteBuffer data) {
		this.data = data;
	}
	
	public TextureUtilTestValues getValues() {
		return values;
	}
	
	public void setValues(TextureUtilTestValues values) {
		this.values = values;
	}
	
	
	
}
