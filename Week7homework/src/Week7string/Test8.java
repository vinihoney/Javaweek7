package Week7string;
/* 8. Write a java program which replace string to lower case. */
/*Note: Why we don't have whole text in display here
Input the Name: Why can't we can have full text? sonal
sonal*/
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Input the Name: ");
        String sname = str.next();
        System.out.println(sname.toLowerCase());
    }
}
