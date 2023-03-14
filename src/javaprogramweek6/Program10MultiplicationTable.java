/* Write a Java program that takes a number as input and prints its
  multiplication table up to 10.
  Test Data: Input a number: 8
  Expected Output :
  8 x 1 = 8
  8 x 2 = 16
  8 x 3 = 24
  ...
  8 x 10 = 80
 */
package javaprogramweek6;

import java.util.Scanner;

public class Program10MultiplicationTable {
    public static void table(int n) { // static - table method
        System.out.println(n + " * " + "1" + " = " + (n * 1));// multiplication table
        System.out.println(n + " * " + "2" + " = " + (n * 2));
        System.out.println(n + " * " + "3" + " = " + (n * 3));
        System.out.println(n + " * " + "4" + " = " + (n * 4));
        System.out.println(n + " * " + "5" + " = " + (n * 5));
        System.out.println(n + " * " + "6" + " = " + (n * 6));
        System.out.println(n + " * " + "7" + " = " + (n * 7));
        System.out.println(n + " * " + "8" + " = " + (n * 8));
        System.out.println(n + " * " + "9" + " = " + (n * 9));
        System.out.println(n + " * " + "10" + " = " + (n * 10));

    }

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer number: ");// user enter the input
        int number = scanner.nextInt();
        scanner.close();
        table(number);// calling table method (static)
    }
}
