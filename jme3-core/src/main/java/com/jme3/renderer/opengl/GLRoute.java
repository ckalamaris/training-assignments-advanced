package com.jme3.renderer.opengl;

import java.nio.IntBuffer;

public interface GLRoute extends GL {

	public void glGetInteger(int pname, IntBuffer params);
	public String glGetString(int name);
	public void glEnable(int cap);
	public void glDisable(int cap);
	
}
