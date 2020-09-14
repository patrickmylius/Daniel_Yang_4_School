package Chap2;

import java.util.Scanner;

public class Exercise_02_03 {
    public static void main(String[] args) {
        //declare scanner and name it input
        Scanner input = new Scanner(System.in);
        //souts for user input
        System.out.println("Enter a value for meter: ");
        //sets user input to meter
        double meter = input.nextDouble();
        //sets feet to meter * 3.2786(feet pr. meter)
        double feet = meter * 3.2786;
        //souts the convertion of meter to feet
        System.out.println(meter + " "+ "meters is" + " " + feet + " " + "feet");
    }
}
