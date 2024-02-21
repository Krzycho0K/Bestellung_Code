package com.cc.java;

public class ArrayPlayground {

	static int [] numArr = {2,4,6,7,20};
	// static String strArr = {"Ich", "bin", "Maxine", "Mützerich"};

    public static void main(String[] args) {

		// System.out.println(numArr);

		
		

		System.out.print("Alle Aray Elemente: " + numArr.length + " {");
		indexArr();
		
		outputArr();

		numArr[0] = 100;
		System.out.println("Erste Array Element auf 100 setzen ");
		
		// numArr[4] = 101
		numArr[numArr.length-1] = 101;
		System.out.println("Letzte Array Element auf 101 setzen ");

		outputArr();
		

		
		System.out.println(" ");
		System.out.println("Summe: " + numArr[0] + "+" + numArr[1] + "+" + numArr[2] + "+" + numArr[3] + "+" + numArr[4] + " = " + (numArr[0] + numArr[1] + numArr[2] + numArr[3] + numArr[4]));
	}

	static void outputArr(){
		System.out.println("-----------------");

		// System.out.println("Element 1: " + numArr[0]);
		// System.out.println("Element 2: " + numArr[1]);
		// System.out.println("Element 3: " + numArr[2]);
		// System.out.println("Element 4: " + numArr[3]);
		// System.out.println("Element 5: " + numArr[4]);

for (int i = 0; i < numArr.length; i++)
		if (i < numArr.length-1) {
	System.out.println("Element " + (i+1) + ": " + numArr[i]);
		} else {
	System.out.println("Element " + (i+1) + ": " + numArr[i]);
		}

		// System.out.println("-----------------");
	}
	

	// System.out.println("Alle Aray Elemente: " + numArr.length + " {" + numArr[0] + "," + numArr[1] + "," + numArr[2] + "," + numArr[3] + "," + numArr[4] + "}");

static void indexArr(){
	for (int a = 0; a < numArr.length; a++)
		if (a < numArr.length-1) {
	System.out.print(numArr[a] + ",");
		} else {
	System.out.println(numArr[a] + "}");
		}

}

}
