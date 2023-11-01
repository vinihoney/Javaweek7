package Week7;

import java.util.Scanner;
/*7. Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C).
*/
public class ConverTtempreture7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Temprature: ");
        float Temprature = in.nextInt();
        float Celsius;
        Celsius = ((Temprature - 32) * 5) / 9;
        System.out.println("Temprature is " + Temprature + " Fahrenheit.");
        System.out.println("Temperature in celsius is: " + Celsius);
    }
}
