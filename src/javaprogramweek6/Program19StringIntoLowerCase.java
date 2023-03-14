/*  Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */
package javaprogramweek6;

public class Program19StringIntoLowerCase {
    public static void upperCase(String upper){ // static method

        System.out.println("Output: " + upper.toLowerCase());// convert uppercase into lowercase and print
    }

    public static void main(String[] args) {// main method
        String string = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG." ;// given uppercase string
        System.out.println("Input: " + string);// printing the given string

        upperCase(string);// calling static method
    }

}
