package org.ssglobal.training.codes.operators;

public class TestMathOps {

	public static void main(String[] args) {
		
		MathOps mo = new MathOps();
		System.out.println(mo.divide(10, 3));
		System.out.println(mo.calcRemainder(10, 3));
		System.out.println(mo.divideNum(10, 3));
		System.out.println(mo.divideNumParams(10, 3));
		System.out.println(mo.divideNumCustom(10, 3));
		System.out.println(mo.divideNum2(10, 3));
	}

}
