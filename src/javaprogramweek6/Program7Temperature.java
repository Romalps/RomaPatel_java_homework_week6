/*  Write a program to insert any temperature value in degree Fahrenheit and
    convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
package javaprogramweek6;

import java.util.Scanner;

public class Program7Temperature {
    static float temp;//static variable

    public static void celsius() { // static - celsius method

        System.out.println("Temperature is: " + temp + "°C");

    }

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);// user input
        System.out.print("Enter any temperature value in degree Fahrenheit: ");
        float f = scanner.nextFloat();
        temp = ((f - 32) * 5 / 9);// formula to convert temperature fahrenheit into celsius
        scanner.close();
        celsius();// calling celsius method
    }
}
