package Week7;
/*10. Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 10 = 80 */
import java.util.Scanner;
public class Timetabel10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n1 = in.nextInt();

        for (int n2 = 0; n2 < 11; n2++) { // for loops
            System.out.println(n1 + " * " + n2 + " = " + n1 * n2);
            if (n2 == 11) { //if condition
                break;
            }
        }
    }
}