package com.jme3.renderer.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public interface GLChild2 extends GL {
	
	public void glClear(int mask);
	public void glClearColor(float red, float green, float blue, float alpha);
	public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);
	public void glCompileShader(int shader);
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data);
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data);
	public int glCreateProgram();
	public int glCreateShader(int shaderType);
	public void glCullFace(int mode);
	public void glDeleteBuffers(IntBuffer buffers);
	public void glDeleteProgram(int program);
	public void glDeleteShader(int shader);
	public void glDeleteTextures(IntBuffer textures);
	public void glDepthFunc(int func);
	public void glDepthMask(boolean flag);
	public void glDepthRange(double nearVal, double farVal);
	public void glDetachShader(int program, int shader);
	public void glDisableVertexAttribArray(int index);
	public void glDrawArrays(int mode, int first, int count);

}
