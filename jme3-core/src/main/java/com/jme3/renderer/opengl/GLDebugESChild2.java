package com.jme3.renderer.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class GLDebugESChild2 extends GLDebug implements GLChild2, GLFbo, GLExt {

    private final GLFbo glfbo;
    private final GLExt glext;

    public GLDebugESChild2(GLChild2 glChild2, GLExt glext, GLFbo glfbo) {
        this.glChild2 = glChild2;
        this.glext = glext;
        this.glfbo = glfbo;
    }

    public void glClear(int mask) {
    	glChild2.glClear(mask);
        checkError();
    }

    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        glChild2.glColorMask(red, green, blue, alpha);
        checkError();
    }

    public void glCompileShader(int shader) {
        glChild2.glCompileShader(shader);
        checkError();
    }

    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
        glChild2.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
        checkError();
    }

    public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        glChild2.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
        checkError();
    }

    public int glCreateProgram() {
        int program = glChild2.glCreateProgram();
        checkError();
        return program;
    }

    public int glCreateShader(int shaderType) {
        int shader = glChild2.glCreateShader(shaderType);
        checkError();
        return shader;
    }

    public void glCullFace(int mode) {
        glChild2.glCullFace(mode);
        checkError();
    }

    public void glDeleteBuffers(IntBuffer buffers) {
        glChild2.glDeleteBuffers(buffers);
        checkError();
    }

    public void glDeleteProgram(int program) {
        glChild2.glDeleteProgram(program);
        checkError();
    }

    public void glDeleteShader(int shader) {
        glChild2.glDeleteShader(shader);
        checkError();
    }

    public void glDeleteTextures(IntBuffer textures) {
        glChild2.glDeleteTextures(textures);
        checkError();
    }

    public void glDepthFunc(int func) {
        glChild2.glDepthFunc(func);
        checkError();
    }

    public void glDepthMask(boolean flag) {
        glChild2.glDepthMask(flag);
        checkError();
    }

    public void glDepthRange(double nearVal, double farVal) {
        glChild2.glDepthRange(nearVal, farVal);
        checkError();
    }

    public void glDetachShader(int program, int shader) {
        glChild2.glDetachShader(program, shader);
        checkError();
    }

    public void glDisable(int cap) {
        glChild2.glDisable(cap);
        checkError();
    }

    public void glDisableVertexAttribArray(int index) {
        glChild2.glDisableVertexAttribArray(index);
        checkError();
    }

    public void glDrawArrays(int mode, int first, int count) {
        glChild2.glDrawArrays(mode, first, count);
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

	@Override
	public void glClearColor(float red, float green, float blue, float alpha) {
		// TODO Auto-generated method stub
		
	}

}
