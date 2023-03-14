/*  Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.5 * 8.5 = 46.75
Perimeter is 2 * (5.5 + 8.5) = 28.0
 */
package javaprogramweek6;

import java.util.Scanner;
public class Program14Rectangle {
    public void areaOfRectangle(float w, float h) { // Instance method

        float area = w * h;// formula for Area of a Rectangle
        System.out.println("Area of the rectangle is: " + area);// printing the result of an Area

    }
    public static void perimeterOfRectangle(float w, float h) { //static method

        float perimeter = 2 * (w + h);// formula for perimeter of a rectangle
        System.out.println("Perimeter of the rectangle is: " + perimeter);// printing the result of a perimeter

    }
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);// for user input
        System.out.print("Enter the width of the rectangle: ");
        float width = scanner.nextFloat();
        System.out.print("Enter the height of the rectangle: ");
        float height = scanner.nextFloat();

        scanner.close();
        Program14Rectangle obj = new Program14Rectangle();// create an object for Instance method
        obj.areaOfRectangle(width, height);// calling an instance method

        perimeterOfRectangle(width, height);// calling a static method
    }
}
