/*  Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/
package javaprogramweek6;

public class Program4TwoInstanceStaticVariable {
        // 1. Two instance variables
    int x, y;
        // Two static variables
    static int a, b;

        //2. Instance method
    public void myMethod() {
        // calling instance and static variables in the instance method
        x = 10;
        y = 20;
        a = 30;
        b = 40;
        // Instance and Static variables inside the print statement
        System.out.println((x + y) * (a + b));
    }

        // 3. Static method
    public static void yourMethod() {
        // Calling instance variable with object and static variables in the static method
        Program4TwoInstanceStaticVariable obj = new Program4TwoInstanceStaticVariable();
        obj.x = 100;
        obj.y = 200;
        a = 300;
        b = 400;
        // Instance and static variable inside the print statement
        System.out.println((obj.x + obj.y) * (a + b));
    }

        // main method
    public static void main(String[] args) {
        // calling instance method with object and static method in the main method
        Program4TwoInstanceStaticVariable obj1 = new Program4TwoInstanceStaticVariable();
        obj1.myMethod();
        yourMethod();

    }
}
