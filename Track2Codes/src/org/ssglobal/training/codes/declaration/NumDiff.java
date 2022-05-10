package org.ssglobal.training.codes.declaration;

public class NumDiff {
	
	public int calculateNumdiff(int x) {
		
		//int sqr = calculateSquare(x);
		//int cube = calculateCube(x);
		//int numdiff = cube - sqr;
		int numdiff = calculateCube(x) - calculateSquare(x);
		return numdiff;
	}
	
	public int calculateSquare(final int x) {
		int square = x * x;
		return square;
	}

	public int calculateCube(final int x) {
		int cube = x * x * x;
		return cube;
	}
}
