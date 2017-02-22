package com.jme3.renderer.opengl;

public class TextureUtilTestValuesData {
	public int target;
	public int level;
	public int slice;
	public int sliceCount;

	public TextureUtilTestValuesData() {
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSlice() {
		return slice;
	}

	public void setSlice(int slice) {
		this.slice = slice;
	}

	public int getSliceCount() {
		return sliceCount;
	}

	public void setSliceCount(int sliceCount) {
		this.sliceCount = sliceCount;
	}

	public TextureUtilTestValuesData(int target, int level, int slice, int sliceCount) {
		super();
		this.target = target;
		this.level = level;
		this.slice = slice;
		this.sliceCount = sliceCount;
	}
	
	
}