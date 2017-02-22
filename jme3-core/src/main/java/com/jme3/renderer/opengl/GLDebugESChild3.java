package com.jme3.renderer.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class GLDebugESChild3 extends GLDebug implements GLChild3, GLFbo, GLExt {

    private final GLFbo glfbo;
    private final GLExt glext;

    public GLDebugESChild3(GLChild3 glChild3, GLExt glext, GLFbo glfbo) {
        this.glChild3 = glChild3;
        this.glext = glext;
        this.glfbo = glfbo;
    }


    public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        glChild3.glDrawRangeElements(mode, start, end, count, type, indices);
        checkError();
    }

    public void glEnable(int cap) {
        glChild3.glEnable(cap);
        checkError();
    }

    public void glEnableVertexAttribArray(int index) {
        glChild3.glEnableVertexAttribArray(index);
        checkError();
    }

    public void glGenBuffers(IntBuffer buffers) {
        glChild3.glGenBuffers(buffers);
        checkError();
    }

    public void glGenTextures(IntBuffer textures) {
        glChild3.glGenTextures(textures);
        checkError();
    }

    public int glGetAttribLocation(int program, String name) {
        int location = glChild3.glGetAttribLocation(program, name);
        checkError();
        return location;
    }

    public void glGetBoolean(int pname, ByteBuffer params) {
        glChild3.glGetBoolean(pname, params);
        checkError();
    }

    public int glGetError() {
        // No need to check for error here? Haha
        return glChild3.glGetError();
    }

    public void glGetInteger(int pname, IntBuffer params) {
        glChild3.glGetInteger(pname, params);
        checkError();
    }

    public void glGetProgram(int program, int pname, IntBuffer params) {
        glChild3.glGetProgram(program, pname, params);
        checkError();
    }

    public String glGetProgramInfoLog(int program, int maxSize) {
        String infoLog =  glChild3.glGetProgramInfoLog(program, maxSize);
        checkError();
        return infoLog;
    }

    public void glGetShader(int shader, int pname, IntBuffer params) {
        glChild3.glGetShader(shader, pname, params);
        checkError();
    }

    public String glGetShaderInfoLog(int shader, int maxSize) {
        String infoLog = glChild3.glGetShaderInfoLog(shader, maxSize);
        checkError();
        return infoLog;
    }

    public String glGetString(int name) {
        String string = glChild3.glGetString(name);
        checkError();
        return string;
    }

    public int glGetUniformLocation(int program, String name) {
        int location = glChild3.glGetUniformLocation(program, name);
        checkError();
        return location;
    }

    public boolean glIsEnabled(int cap) {
        boolean enabled = glChild3.glIsEnabled(cap);
        checkError();
        return enabled;
    }

    public void glLineWidth(float width) {
        glChild3.glLineWidth(width);
        checkError();
    }

    public void glLinkProgram(int program) {
        glChild3.glLinkProgram(program);
        checkError();
    }

    public void glPixelStorei(int pname, int param) {
        glChild3.glPixelStorei(pname, param);
        checkError();
    }

    public void glPolygonOffset(float factor, float units) {
        glChild3.glPolygonOffset(factor, units);
        checkError();
    }

    public void glBindFramebufferEXT(int param1, int param2) {
        glfbo.glBindFramebufferEXT(param1, param2);
        checkError();
    }

    public void glBindRenderbufferEXT(int param1, int param2) {
        glfbo.glBindRenderbufferEXT(param1, param2);
        checkError();
    }

    public int glCheckFramebufferStatusEXT(int param1) {
        int result = glfbo.glCheckFramebufferStatusEXT(param1);
        checkError();
        return result;
    }

    public void glDeleteFramebuffersEXT(IntBuffer param1) {
        glfbo.glDeleteFramebuffersEXT(param1);
        checkError();
    }

    public void glDeleteRenderbuffersEXT(IntBuffer param1) {
        glfbo.glDeleteRenderbuffersEXT(param1);
        checkError();
    }

    public void glFramebufferRenderbufferEXT(int param1, int param2, int param3, int param4) {
        glfbo.glFramebufferRenderbufferEXT(param1, param2, param3, param4);
        checkError();
    }

    public void glFramebufferTexture2DEXT(int param1, int param2, int param3, int param4, int param5) {
        glfbo.glFramebufferTexture2DEXT(param1, param2, param3, param4, param5);
        checkError();
    }

    public void glGenFramebuffersEXT(IntBuffer param1) {
        glfbo.glGenFramebuffersEXT(param1);
        checkError();
    }

    public void glGenRenderbuffersEXT(IntBuffer param1) {
        glfbo.glGenRenderbuffersEXT(param1);
        checkError();
    }

    public void glGenerateMipmapEXT(int param1) {
        glfbo.glGenerateMipmapEXT(param1);
        checkError();
    }

    public void glRenderbufferStorageEXT(int param1, int param2, int param3, int param4) {
        glfbo.glRenderbufferStorageEXT(param1, param2, param3, param4);
        checkError();
    }

    public void glBlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        glfbo.glBlitFramebufferEXT(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        checkError();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, ByteBuffer data) {
        glChild3.glGetBufferSubData(target, offset, data);
        checkError();
    }
    
    public void glBufferData(int target, IntBuffer data, int usage) {
        glext.glBufferData(target, data, usage);
        checkError();
    }

    public void glBufferSubData(int target, long offset, IntBuffer data) {
        glext.glBufferSubData(target, offset, data);
        checkError();
    }

    public void glDrawArraysInstancedARB(int mode, int first, int count, int primcount) {
        glext.glDrawArraysInstancedARB(mode, first, count, primcount);
        checkError();
    }

    public void glDrawBuffers(IntBuffer bufs) {
        glext.glDrawBuffers(bufs);
        checkError();
    }

    public void glDrawElementsInstancedARB(int mode, int indices_count, int type, long indices_buffer_offset, int primcount) {
        glext.glDrawElementsInstancedARB(mode, indices_count, type, indices_buffer_offset, primcount);
        checkError();
    }

    public void glGetMultisample(int pname, int index, FloatBuffer val) {
        glext.glGetMultisample(pname, index, val);
        checkError();
    }

    public void glRenderbufferStorageMultisampleEXT(int target, int samples, int internalformat, int width, int height) {
        glfbo.glRenderbufferStorageMultisampleEXT(target, samples, internalformat, width, height);
        checkError();
    }

    public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        glext.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
        checkError();
    }

    public void glVertexAttribDivisorARB(int index, int divisor) {
        glext.glVertexAttribDivisorARB(index, divisor);
        checkError();
    }

    @Override
    public int glClientWaitSync(Object sync, int flags, long timeout) {
        int result = glext.glClientWaitSync(sync, flags, timeout);
        checkError();
        return result;
    }

    @Override
    public void glDeleteSync(Object sync) {
        glext.glDeleteSync(sync);
        checkError();
    }

    @Override
    public Object glFenceSync(int condition, int flags) {
        Object sync = glext.glFenceSync(condition, flags);
        checkError();
        return sync;
    }

}
