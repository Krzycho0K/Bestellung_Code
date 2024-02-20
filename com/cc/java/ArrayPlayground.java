package com.cc.java;


public class ArrayPlayground {

	static int [] numArr = {2,4,6,7};
	// static String strArr = {"Ich", "bin", "Maxine", "Mützerich"};

    public static void main(String[] args) {

		System.out.println(numArr);	
		System.out.println("Element 1: " + numArr[0]);
		System.out.println("Element 2: " + numArr[1]);
		System.out.println("Element 3: " + numArr[2]);
		System.out.println("Element 4: " + numArr[3]);
		
		System.out.println(" ");
		System.out.println("Summe: " + numArr[0] + "+" + numArr[1] + "+" + numArr[2] + "+" + numArr[3] + " = " + (numArr[0] + numArr[1] + numArr[2] + numArr[3]));
		

	}

}
