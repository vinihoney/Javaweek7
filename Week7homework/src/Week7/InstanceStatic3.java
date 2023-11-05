package Week7;

/* 3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme. */
public class InstanceStatic3 {
    int age = 18; // 3.1 Declare one instance and one static variable.
    static String name = "Rose";  //3.1 Declare one instance and one static variable.

    public void instance1() //3.2 Declare one instance method.
    {
       /* 3.4 Call both instance and static variables into both instance
        and static methods inside the print statement.*/
        System.out.println("Instance Method : " + name + " " + age);
        // System.out.println(age);  //called Instance Variable Directly
        //System.out.println(name); //called Static Variable Directly
    }

    public static void static1()//3.3 Declare one static method.
    {
        /* 3.4 Call both instance and static variables into both instance
        and static methods inside the print statement.*/
        InstanceStatic3 obj = new InstanceStatic3();//Create an Object,
        System.out.println("Static Method : " + name + " " + obj.age);
        //System.out.println(obj.age);  //Called Instance Variable to static method using object name
        //System.out.println(name); //Called sttic variable to static method Directly
    }

    public static void main(String[] args) {  //3.5 Declare the Main method. Or Predefined method

        //3.6 Call both instance and static methods into the Main method and run the programme.

        InstanceStatic3 age = new InstanceStatic3();  //Create an Object
        age.instance1();  //Called Instance method to Static method using object name
        static1();  //Called static method to Static method Directly
        InstanceStatic3.static1(); ////Called static method to Static method via Class name
        System.out.println("Main Method : " );
    }
}
