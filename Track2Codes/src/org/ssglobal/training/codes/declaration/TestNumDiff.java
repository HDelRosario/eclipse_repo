package org.ssglobal.training.codes.declaration;

public class TestNumDiff {

	public static void main(String[] args) {
		String num = args[0];
		int numVal = Integer.parseInt(num);
		
		NumDiff diff = new NumDiff();
		int result = diff.calculateNumdiff(numVal);
		System.out.println(result);
	}

}
