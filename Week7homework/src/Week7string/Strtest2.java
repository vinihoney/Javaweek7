package Week7string;
/*2. Write a java program which remove extra space from both side “ I love
        java ”
        Expected output: “I love java”*/
public class Strtest2 {
    static String jname = "   I Love Java   ";//using static string variable
    public static void main(String[] args){
        System.out.println("Expecte Output: " + jname);
        System.out.println("Expecte Output: " + jname.trim());//using trim remove extra space
        System.out.println(jname.trim());//using trim remove extra space
    }
}
