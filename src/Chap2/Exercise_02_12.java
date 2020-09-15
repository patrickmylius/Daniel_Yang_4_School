package Chap2;
// Write a program that promts the user to enter v in meters/second
// and the acceleration a in meters/second squared (m/s), then, displays the minimum runway length.

import java.util.Scanner;

public class Exercise_02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //souts user to input v(speed) and a(acceleration)
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        //computes length
        double length = Math.pow(v, 2) / (2 * a);

        //souts result
        System.out.println("The minimum runway length for this airplane is: " + length);


    }
}
