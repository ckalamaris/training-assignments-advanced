package com.jme3.renderer.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public interface GLChild5 extends GL {

	public void glUniform4(int location, FloatBuffer value);
	public void glUniform4(int location, IntBuffer value);
	public void glUniform4f(int location, float v0, float v1, float v2, float v3);
	public void glUniformMatrix3(int location, boolean transpose, FloatBuffer value);
	public void glUniformMatrix4(int location, boolean transpose, FloatBuffer value);
	public void glUseProgram(int program);
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);
	public void glViewport(int x, int y, int width, int height);
}
