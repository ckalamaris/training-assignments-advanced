package com.jme3.renderer.opengl;

public class GLDebugES extends GLDebug implements GL {

    private final GLFbo glfbo;
    private final GLExt glext;

    public GLDebugES(GL gl, GLExt glext, GLFbo glfbo) {
        this.gl = gl;
        this.glext = glext;
        this.glfbo = glfbo;
    }
}
