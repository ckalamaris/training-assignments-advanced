package com.jme3.renderer.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public interface GLChild3 extends GL {

	public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices); /// GL2+
	public void glEnableVertexAttribArray(int index);
	public void glGenBuffers(IntBuffer buffers);
	public void glGenTextures(IntBuffer textures);
	public int glGetAttribLocation(int program, String name);
	public void glGetBoolean(int pname, ByteBuffer params);
        public void glGetBufferSubData(int target, long offset, ByteBuffer data);
        public int glGetError();
	public void glGetProgram(int program, int pname, IntBuffer params);
	public String glGetProgramInfoLog(int program, int maxSize);
	public void glGetShader(int shader, int pname, IntBuffer params);
	public String glGetShaderInfoLog(int shader, int maxSize);
	public int glGetUniformLocation(int program, String name);
	public boolean glIsEnabled(int cap);
	public void glLineWidth(float width);
	public void glLinkProgram(int program);
	public void glPixelStorei(int pname, int param);
	public void glPolygonOffset(float factor, float units);
}
