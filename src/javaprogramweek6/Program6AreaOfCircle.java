/* Write a program to enter any radius value of the circle and find out the
   area.(Formula of Area A=PI*r*r)

 */
package javaprogramweek6;

import java.util.Scanner;

public class Program6AreaOfCircle {
    static double area;//Static variable
    static int radius;//static variable
    public static void circle(){// static - circle method
        double pi = 3.14;
        area = pi *radius  * radius ;// formula for Area of the circle
        System.out.println("Area of circle is: "+ area);
    }



    public static void main(String[] args) {// main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any radius value:  ");// user will input the value
        radius = scanner.nextInt();
        scanner.close();

        circle();// calling the circle method
    }
}
