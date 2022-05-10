package org.ssglobal.training.codes.arrays;

class SampleArrays {
	
	public void createSingleArrays() {
		
		char[] letters = new char[5]; //fixed length
		System.out.println(letters[0]); // \0
		letters[0] = 64;
		letters[1] = 'a';
		letters[2] = '\u20B1';
		letters[3] = 'C';
		letters[4] = '\t';
		
		String names[] = new String[10]; //array of objects
		names[names.length-1] = "ABBA"; //last cell
		int lenArray = letters.length; //constant value
		System.out.println(names[0]); //outputs null
		
		double[] grades = new double[] { 78.5, 90.6, 100.5 }; //initialize
		double[] grades2 = { 78.5, 90.6, 100.5};
		System.out.println(grades[0]);
		System.out.println(grades2[0]);
		
		grades = null;
		grades = new double[] { 66.0, 90.5, 22.5, 100.5 };
		//need to re-instantiate
	}
	
	public void createMatrix() {
		
		int[][] matrix = new int [3][3];
		
		// row 1
		matrix[0][0] = 2;
		matrix[0][1] = 5;
		matrix[0][2] = 10;
		
		// row 2
		matrix[1][0] = 1;
		matrix[1][1] = 1;
		matrix[1][2] = 1;
		
		// row 3
		matrix[2][0] = 2;
		matrix[2][1] = 2;
		matrix[2][2] = 2;
		
		double[][] prices = new double[][] { {2.2, 3.3, 4.5}, 
			                                 {8.9, 4.5, 1.1}, 
			                                 {3.4, 6.6, 4.5} };
			                       
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		for(double[] rowLookup : prices) {
			for(double colLookup: rowLookup) {
				System.out.print(colLookup + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
