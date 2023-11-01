package Week7string;
/* 7. Write a java program which replace string to upper case.*/
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Input the Name: ");
        String sname = (str.next().toUpperCase());
        System.out.println(sname);
    }
}
