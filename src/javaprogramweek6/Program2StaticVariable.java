/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

package javaprogramweek6;

public class Program2StaticVariable {
    // 1. Two static variables
    static int a, b;
    // 2. Static method
    public static void multiplication() {
        // 3. static variables in the static method
        a = 10;
        b = 25;
        // static variables inside the print statement
        System.out.println(a * b);
    }
    // 4. Main method
    public static void main(String[] args) {
        // 5.calling the static method in the main method
        multiplication();
    }
}
