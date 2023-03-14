/* Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
*/
package javaprogramweek6;

public class Program3InstanceAndStaticVariable {
    // 1.Instance variable
    int a;
    //1. Static variable
    static int b;

    // 2. instance method
    public void addition() {
        //4.  Instance and static variable in the instance method
        a = 25;
        b = 20;
        // Instance and static variable inside the print statement
        System.out.println(a + b);
    }

    // 3. Static method
    public static void subtraction() {
        // 4.static variable in the static method
        Program3InstanceAndStaticVariable obj1 = new Program3InstanceAndStaticVariable();
        obj1.a = 50;
        b = 25;
        // static variable inside the print statement
        System.out.println(obj1.a - b);
    }

    // 5.main method
    public static void main(String[] args) {
        // object creation
        Program3InstanceAndStaticVariable obj = new Program3InstanceAndStaticVariable();
        // 6.Calling Instance method
        obj.addition();
        // calling Static method
        subtraction();
    }

}
