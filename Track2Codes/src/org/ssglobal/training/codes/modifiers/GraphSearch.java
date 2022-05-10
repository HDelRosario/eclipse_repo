package org.ssglobal.training.codes.modifiers;

public class GraphSearch extends MyLog {
//public class GraphSearch extends GraphMe { //extends: error (because of final keyword)
	
	public void plot() {
		GraphMe gm = new GraphMe();
		gm.scatter(); //once "final" keyword is removed from GraphMe
				   //sharing or reusing method happens
		
		//MyLog log = new MyLog(); //left side is instantiation
		computeLogBase10(); // done after extending / inheritance
	}

}
