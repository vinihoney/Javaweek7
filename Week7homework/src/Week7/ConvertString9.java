package Week7;
// 9. Write a program to convert the upper case to lower case.
//Note: Only Print text before space.
import java.util.Scanner;
public class ConvertString9 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);// used scanner class function
        String sname = (str.next().toUpperCase());//used uppercase function
        System.out.println("ALL IN UPPERCASE: "+ sname);
    }
}

