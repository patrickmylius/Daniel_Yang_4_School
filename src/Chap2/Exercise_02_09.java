package Chap2;

import java.util.Scanner;

public class Exercise_02_09 {
    public static void main(String[] args) {
        //sets Scanner to input
        Scanner input = new Scanner(System.in);
        //souts user for an input
        System.out.println("Enter v0, v1, and t: ");
        //User input set to variable double v0, v1 and t.
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        //computes v1 - v0 / t and sets it to acceleration
        double acceleration = (v1 - v0) / t;
        //souts acceleration
        System.out.println(acceleration);
    }

}
