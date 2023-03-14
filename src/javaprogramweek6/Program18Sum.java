/*  Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
package javaprogramweek6;

import java.util.Scanner;

public class Program18Sum {
    public static void addition(int a, int b) {// static method
        System.out.println(a + " + " + b + " = " + (a + b));// adding two numbers
    }

    public static void multiply(int a, int b) { // static method
        System.out.println(a + " * " + b + " = " + (a * b));// multiplying two numbers
    }

    public void subtract(int a, int b) {// instance method
        System.out.println(a + " - " + b + " = " + (a - b));// subtracting two numbers
    }

    public void divide(int a, int b) {// instance method
        System.out.println(a + " / " + b + " = " + (a / b)); //dividing two numbers
    }

    public static void remainder(int a, int b) {// static method

        System.out.println(a + " mod " + b + " = " + (a % b));// remainder of two numbers
    }

    public static void main(String[] args) {// main method
        Scanner scanner = new Scanner(System.in);// to read user input
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        scanner.close();
        addition(num1, num2);// calling static method
        Program18Sum obj = new Program18Sum();// creating object to call instance method
        obj.subtract(num1, num2);// calling instance method with object
        multiply(num1, num2);// calling static method
        obj.divide(num1, num2);// calling instance method with object
        remainder(num1, num2);// calling static method
    }
}
