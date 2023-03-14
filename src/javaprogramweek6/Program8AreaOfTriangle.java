/*  Write a program to calculate the area of a triangle.
 */
package javaprogramweek6;

import java.util.Scanner;

public class Program8AreaOfTriangle {

    public static void triangle(float b, float h) { // static - triangle method

        float area = (b * h) / 2;// formula to calculate the area of a triangle
        System.out.println("Area of a triangle: " + area);

    }

    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in);// user input
        System.out.print("Enter the triangle's base: ");
        float base = scanner.nextFloat();// input will store in the base variable
        System.out.print("Enter the triangle's height: ");
        float height = scanner.nextFloat();// second input will store in the height variable
        scanner.close();

        triangle(base, height);//calling triangle method
    }
}

