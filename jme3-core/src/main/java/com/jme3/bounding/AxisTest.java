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

	public boolean calculateAxisTestE0X(float p0, float p2, Vector3f tmp0, Vector3f tmp2, Vector3f e0, float fey,
			float fez, Vector3f extent, TempVars vars) {
		// AXISTEST_X01(e0[Z], e0[Y], fez, fey);
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

	public boolean calculateAxisTestE0Z(float p0, float p2, Vector3f tmp0, Vector3f tmp2, Vector3f e0, float fex,
			float fez, Vector3f extent, TempVars vars) {
		// AXISTEST_Y02(e0[Z], e0[X], fez, fex);
		p0 = -e0.z * tmp0.x + e0.x * tmp0.z;
		p2 = -e0.z * tmp2.x + e0.x * tmp2.z;
		min = min(p0, p2);
		max = max(p0, p2);
		rad = fez * extent.x + fex * extent.z;
		if (min > rad || max < -rad) {
			vars.release();
			return false;
		}
		return true;
	}

	public boolean calculateAxisTestE0Y(float p0, float p2, Vector3f tmp1, Vector3f tmp2, Vector3f e0, float fey,
			float fex, Vector3f extent, TempVars vars) {
		// AXISTEST_Z12(e0[Y], e0[X], fey, fex);
		p1 = e0.y * tmp1.x - e0.x * tmp1.y;
		p2 = e0.y * tmp2.x - e0.x * tmp2.y;
		min = min(p1, p2);
		max = max(p1, p2);
		rad = fey * extent.x + fex * extent.y;
		if (min > rad || max < -rad) {
			vars.release();
			return false;
		}
		return true;
	}
}
