/*    Write a Java program to convert a decimal number to binary number.
        Input Data:
        Input a Decimal Number : 5
        Expected Output
        Binary number is: 101
*/

package javaprogramweek6;

import java.util.Scanner;

public class Program17DecimalToBinary {

    public static void convert(int n1) {// static method

        System.out.println("Binary number is: " + Integer.toBinaryString(n1));// convert decimal number into binary number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// to read user input
        System.out.print("Input a decimal number: ");
        int number = scanner.nextInt();
        scanner.close();
        convert(number);// calling static method
    }
}
