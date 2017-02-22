package com.jme3.renderer.opengl;

public class TextureUtilTestValues {

	private TextureUtilTestValuesData data;
	private TextureUtilTestValuesDimensions dimensions;
	
	public TextureUtilTestValues() {
		// TODO Auto-generated constructor stub
	}

	public TextureUtilTestValues(TextureUtilTestValuesData data, TextureUtilTestValuesDimensions dimensions) {
		super();
		this.data = data;
		this.dimensions = dimensions;
	}

	public TextureUtilTestValuesData getData() {
		return data;
	}

	public void setData(TextureUtilTestValuesData data) {
		this.data = data;
	}

	public TextureUtilTestValuesDimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(TextureUtilTestValuesDimensions dimensions) {
		this.dimensions = dimensions;
	}
	
}
