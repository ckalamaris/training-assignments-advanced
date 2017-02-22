package com.jme3.renderer.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class GLDebugESChild1 extends GLDebug implements GLChild1, GLFbo, GLExt {

    private final GLFbo glfbo;
    private final GLExt glext;

    public GLDebugESChild1(GLChild1 glChild1, GLExt glext, GLFbo glfbo) {
        this.glChild1 = glChild1;
        this.glext = glext;
        this.glfbo = glfbo;
    }

    public void resetStats() {
    	glChild1.resetStats();
    }
    
    public void glActiveTexture(int texture) {
        glChild1.glActiveTexture(texture);
        checkError();
    }

    public void glAttachShader(int program, int shader) {
        glChild1.glAttachShader(program, shader);
        checkError();
    }

    public void glBindBuffer(int target, int buffer) {
        glChild1.glBindBuffer(target, buffer);
        checkError();
    }

    public void glBindTexture(int target, int texture) {
        glChild1.glBindTexture(target, texture);
        checkError();
    }

    public void glBlendFunc(int sfactor, int dfactor) {
    	glChild1.glBlendFunc(sfactor, dfactor);
        checkError();
    }
    
    public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dFactorAlpha)
    {
    	glChild1.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dFactorAlpha);
       checkError();
    }

    public void glBufferData(int target, FloatBuffer data, int usage) {
    	glChild1.glBufferData(target, data, usage);
        checkError();
    }

    public void glBufferData(int target, ShortBuffer data, int usage) {
    	glChild1.glBufferData(target, data, usage);
        checkError();
    }

    public void glBufferData(int target, ByteBuffer data, int usage) {
    	glChild1.glBufferData(target, data, usage);
        checkError();
    }

    public void glBufferSubData(int target, long offset, FloatBuffer data) {
    	glChild1.glBufferSubData(target, offset, data);
        checkError();
    }

    public void glBufferSubData(int target, long offset, ShortBuffer data) {
    	glChild1.glBufferSubData(target, offset, data);
        checkError();
    }

    public void glBufferSubData(int target, long offset, ByteBuffer data) {
    	glChild1.glBufferSubData(target, offset, data);
        checkError();
    }

    public void glClear(int mask) {
    	glChild2.glClear(mask);
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
	public void glBlendEquationSeparate(int colorMode, int alphaMode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glBufferData(int target, long data_size, int usage) {
		// TODO Auto-generated method stub
		
	}

}
