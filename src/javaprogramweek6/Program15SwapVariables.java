/* Write a Java program to swap two variables.
 */
package javaprogramweek6;

import java.util.Scanner;

public class Program15SwapVariables {

    public static void swap(int a, int b) { // static method
        int c = a; // temporary assign variable 'c' has 'a's' value
        a = b; // a has b's value
        b = c;// b has c's value which is a's value

        System.out.println(" Swap two variables: " + "a = " + a + ", b = " + b);
    }

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        scanner.close();
        swap(number1, number2);// calling static method
    }
}
