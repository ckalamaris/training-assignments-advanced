package com.jme3.renderer.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public interface GLChild1 extends GL {

	public void resetStats();    
	public void glActiveTexture(int texture);
	public void glAttachShader(int program, int shader);
	public void glBindBuffer(int target, int buffer);
	public void glBindTexture(int target, int texture);
	public void glBlendEquationSeparate(int colorMode, int alphaMode);
	public void glBlendFunc(int sfactor, int dfactor);
        public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha);
        public void glBufferData(int target, long data_size, int usage);
	public void glBufferData(int target, FloatBuffer data, int usage);
	public void glBufferData(int target, ShortBuffer data, int usage);
	public void glBufferData(int target, ByteBuffer data, int usage);
	public void glBufferSubData(int target, long offset, FloatBuffer data);
	public void glBufferSubData(int target, long offset, ShortBuffer data);
	public void glBufferSubData(int target, long offset, ByteBuffer data);
	
}
