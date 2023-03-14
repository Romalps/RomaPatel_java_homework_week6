/*  Write a program to convert the upper case to lower case.
 */
package javaprogramweek6;

import java.util.Scanner;

public class Program9UppercaseToLowercase {

    public void convertCase(String up) { // Instance - convertCase method

        System.out.println("Uppercase converted into the lowercase: " + up.toLowerCase());//converting uppercase to lowercase
    }

    public static void main(String[] args) {// main method
        Scanner scanner = new Scanner(System.in);//user input
        System.out.print("Enter the string in uppercase: ");
        String convert = scanner.nextLine();
        scanner.close();

        Program9UppercaseToLowercase obj = new Program9UppercaseToLowercase();// creating object to call instance method
        obj.convertCase(convert);// calling instance method

    }
}
