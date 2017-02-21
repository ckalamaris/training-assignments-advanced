package com.jme3.bounding;

import static java.lang.Math.max;
import static java.lang.Math.min;

import com.jme3.math.Vector3f;
import com.jme3.util.TempVars;

public class AxisTest {

	private float min;
	private float max;
	private float p1;
	private float p2;
	private float rad;
	
	
	public AxisTest() {
		// TODO Auto-generated constructor stub
	}
	
	public AxisTest(float min, float max, float p1, float p2, float rad) {
		this.min = min;
		this.max = max;
		this.p1 = p1;
		this.p2 = p2;
		this.rad = rad;
	}

	public float getMin() {
		return min;
	}

	public void setMin(float min) {
		this.min = min;
	}

	public float getMax() {
		return max;
	}

	public void setMax(float max) {
		this.max = max;
	}

	public float getP1() {
		return p1;
	}

	public void setP1(float p1) {
		this.p1 = p1;
	}

	public float getP2() {
		return p2;
	}

	public void setP2(float p2) {
		this.p2 = p2;
	}

	public float getRad() {
		return rad;
	}

	public void setRad(float rad) {
		this.rad = rad;
	}
	
	
	public boolean calculateAxisTestX(float p0, float p2, Vector3f tmp0, Vector3f tmp2, Vector3f e0, float fey, float fez, Vector3f extent, TempVars vars) {
		//AXISTEST_X01(e0[Z], e0[Y], fez, fey);
        p0 = e0.z * tmp0.y - e0.y * tmp0.z;
        p2 = e0.z * tmp2.y - e0.y * tmp2.z;
        min = min(p0, p2);
        max = max(p0, p2);
        rad = fez * extent.y + fey * extent.z;
        if (min > rad || max < -rad) {
            vars.release();
            return false;
        }
		return true;
	}
	
	
}
