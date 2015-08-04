package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


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
