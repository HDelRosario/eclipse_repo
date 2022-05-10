package org.ssglobal.training.codes.declaration;

public class TestColor {

	public static void main(String[] args) {
		
		// Assumption: should have 1 item as input
		String color = args[0];
		int colorNum = Integer.parseInt(color);
		
		Color c = new Color();
		c.guessColor(colorNum);
	}
}

class Color{
	
	public void guessColor(int color) {
		
		if(color >= 0 & color <= 10) {
			System.out.println("blue");
		} else if(color > 10 & color <= 20) {
			System.out.println("red");
		} else if(color > 20 & color <= 30) {
			System.out.println("green");
		}
	}
}

