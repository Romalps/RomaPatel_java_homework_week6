/* Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */

package javaprogramweek6;

import java.util.Scanner;

public class Program16AddTwoBinaryNumbers {

    public static void binary(String b1, String b2) { // static method

        int number1 = Integer.parseInt(b1, 2);//converting  first binary string into integer
        int number2 = Integer.parseInt(b2, 2);// converting second binary string into integer
        int numbers = number1 + number2;// adding two integer numbers
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(numbers));// converting integer numbers into binary string
    }

    public static void main(String[] args) {// main method
        Scanner scanner = new Scanner(System.in);//to read user input
        System.out.print("Input first binary number: ");
        String first = scanner.next();
        System.out.print("Input second binary number: ");
        String second = scanner.next();
        scanner.close();

        binary(first, second);// calling static method
    }
}
