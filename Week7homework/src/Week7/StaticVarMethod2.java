package Week7;

import com.sun.tools.javac.Main;

/* 2. Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme. */
public class StaticVarMethod2 {
    static int phone  = 832220; //2.1 Declared static variable1 or Global variable
    static String name = "Rose";  //2.1 Declared static variable2
    public static void m1()// 2.2 Declared Static method
    {
        System.out.println(name); //Called static variable to static method Directly
        System.out.println(phone); //Called static variable to static method via Class name
      }

    public static void main(String[] args) { // 2.4 Declare the Main method Or Predefined method
    //2.5 Call the static method into the Main method and run the programme.
        m1(); // Call the static method directly using the class name
    }

}
