package org.ssglobal.training.codes.answers;

public class Overflow {
	public static boolean sumOverflow(byte x, byte y) {
		int sum = x + y;
		boolean result = (sum < -128 && sum > 127)? true : false;
		
		return result;
	}
}
