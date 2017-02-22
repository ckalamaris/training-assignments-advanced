package com.jme3.renderer.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class GLDebugESChild5 extends GLDebug implements GLChild5, GLFbo, GLExt {

    private final GLFbo glfbo;
    private final GLExt glext;

    public GLDebugESChild5(GLChild5 glChild5, GLExt glext, GLFbo glfbo) {
        this.glChild5 = glChild5;
        this.glext = glext;
        this.glfbo = glfbo;
    }

    public void glUniform4(int location, FloatBuffer value) {
        glChild5.glUniform4(location, value);
        checkError();
    }

    public void glUniform4(int location, IntBuffer value) {
        glChild5.glUniform4(location, value);
        checkError();
    }

    public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        glChild5.glUniform4f(location, v0, v1, v2, v3);
        checkError();
    }

    public void glUniformMatrix3(int location, boolean transpose, FloatBuffer value) {
        glChild5.glUniformMatrix3(location, transpose, value);
        checkError();
    }

    public void glUniformMatrix4(int location, boolean transpose, FloatBuffer value) {
        glChild5.glUniformMatrix4(location, transpose, value);
        checkError();
    }

    public void glUseProgram(int program) {
        glChild5.glUseProgram(program);
        checkError();
    }

    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        glChild5.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
        checkError();
    }

    public void glViewport(int x, int y, int width, int height) {
        glChild5.glViewport(x, y, width, height);
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
