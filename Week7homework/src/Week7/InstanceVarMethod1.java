package Week7;

/*1. Write a Java programme using the following steps.
        1.1 Declare two instance variables.
        1.2 Declare one instance method.
        1.3 Call both instance variables into the instance method inside the print statement.
        1.4 Declare the Main method.
        1.5 Call the above instance method into the Main method and run the programme. */
public class InstanceVarMethod1 {
    int age = 18; //1.1Declared Instance variable1 or Global variable
    String name = "Rose"; //1.1Declared Instance variable2 or Global variable

    public void m1() //1.2 Declared Instance method
    {
        System.out.println(age); // 1.3 Call both instance variables into the instance method inside the sout.
        System.out.println(name);//called Instance Variable Directly
    }

    public static void main(String[] args) {  //1.4 Main method Or Predefined method
        //1.5 Call the above instance method into the Main method and run the programme.
        InstanceVarMethod1 age = new InstanceVarMethod1();//Create an Object
        InstanceVarMethod1 name =new InstanceVarMethod1();
        age.m1();  //Called Instance method to Static method using object name
        name.m1();
    }
}

