package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] operand1 = {76, 90, 4, 87, 70, 57, 48, 70, 31, 69, 18, 40, 76};
        int[] operand2 = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
        int[] expectedResults = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};


        boolean isPassed = true;
        for (int i=0; i<operand1.length; i++) {
            int sum=operand1[i] + operand2[i];
            int expected=expectedResults[i];
            if (sum != expected) {
                System.out.println("Expected: "+ expected +"; Actual: "+sum);
                isPassed = false;
            }
        }
        if (isPassed == true)
        {
            System.out.print("Tests PASSED");
        }
        else{
            System.out.print("Tests FAILED");
        }

    }
}
