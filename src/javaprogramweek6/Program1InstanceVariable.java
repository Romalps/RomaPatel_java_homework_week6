/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
package javaprogramweek6;


public class Program1InstanceVariable {
    // 1. Instance variables
    int a, b;

    // 2. Instance method
    public void addition() {
        // 3. Instance variable in the instance method
        a = 10;
        b = 50;
        // Instance variable inside the print statement
        System.out.println(a + b);

    }

    // 4. Main method
    public static void main(String[] args) {
        // Object creation
        Program1InstanceVariable obj = new Program1InstanceVariable();
        // Calling instance method in the main method
        obj.addition();
    }


}
