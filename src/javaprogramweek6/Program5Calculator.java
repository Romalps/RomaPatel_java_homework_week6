/*      Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods.)

 */
package javaprogramweek6;

import java.util.Scanner;

public class Program5Calculator {

    public static void addition(int a, int b) { // static - Addition method

        System.out.println("Addition of two numbers is:  " + (a + b));
    }

    public static void subtraction(int a, int b) { // static - subtraction method

        System.out.println("Subtraction of two number is: " + (a - b));
    }

    public void multiplication(int a, int b) { // Instance - Multiplication method

        System.out.println("Multiplication of two numbers is: " + (a * b));
    }

    public void division(int a, int b) { // Instance - Division method
        System.out.println("Division of two numbers is:" + (a / b));
    }

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);// for user input

        System.out.print("Enter the first number: ");// asking user input to enter the number
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        scanner.close();

        addition(firstNumber, secondNumber);// calling addition method
        subtraction(firstNumber, secondNumber);// calling subtraction method
        Program5Calculator obj = new Program5Calculator();// created object for instance method
        obj.multiplication(firstNumber, secondNumber);// calling multiplication method with object
        obj.division(firstNumber, secondNumber);// calling division method with object

    }

}
