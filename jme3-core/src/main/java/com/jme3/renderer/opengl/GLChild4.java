package com.jme3.renderer.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public interface GLChild4 extends GL {

	public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data);

	public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset);

	public void glScissor(int x, int y, int width, int height);

	public void glShaderSource(int shader, String[] string, IntBuffer length);

	public void glStencilFuncSeparate(int face, int func, int ref, int mask);

	public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass);

	public void glTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int format,
			int type, ByteBuffer data);

	public void glTexParameterf(int target, int pname, float param);

	public void glTexParameteri(int target, int pname, int param);

	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, ByteBuffer data);

	public void glUniform1(int location, FloatBuffer value);

	public void glUniform1(int location, IntBuffer value);

	public void glUniform1f(int location, float v0);

	public void glUniform1i(int location, int v0);

	public void glUniform2(int location, IntBuffer value);

	public void glUniform2(int location, FloatBuffer value);

	public void glUniform2f(int location, float v0, float v1);

	public void glUniform3(int location, IntBuffer value);

	public void glUniform3(int location, FloatBuffer value);

	public void glUniform3f(int location, float v0, float v1, float v2);
}
