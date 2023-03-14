/*  Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

package javaprogramweek6;

import java.util.Scanner;

public class Program13Average {

    public static void average(int a, int b, int c) { // Static method

        float avg = (a + b + c) / 3; // Average formula = sum of numbers divided by the total numbers
        System.out.println("Average of three numbers is: " + avg);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// for user input
        System.out.print("Enter the First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the Second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the Third number: ");
        int number3 = scanner.nextInt();
        scanner.close();

        average(number1, number2, number3);// calling method

    }
}
