/*
 * Carrie Ward 08/28/2017
 * EvenOrOdd.java
 * A simple JAVA program that determines if a number is even or odd
 */

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args[]){
        
        // use the Scanner class to read input from the user
        Scanner in = new Scanner(System.in);
        
        int number;
        
        // request an interger value from the user
        System.out.print("Enter a number: ");
        // store the user data
        number = in.nextInt();
        
        // determine if the number is even or odd
        if( number % 2 == 0)
            System.out.println( number + " is even.\n" );
        else
            System.out.println( number + " is odd.\n" );
        
    }
}
