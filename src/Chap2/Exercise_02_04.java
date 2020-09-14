package Chap2;
// (Convert square meter into ping)
// Write a program that converts square meter into ping.
// The program prompts the user to enter a number in square meter,
// converts it to ping, and displays the result.
// 1 square meter is 0.3025 ping
import java.util.Scanner;

public class Exercise_02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //souts for an user input
        System.out.println("Enter a number in square meters: ");
        //sets ping to be 0.3025;
        double ping = 0.3025;
        //sets squareMeter to user input
        double squareMeter = input.nextDouble();
        //sets squareToPing to user input * 0,3025;
        double squareToPing = squareMeter * ping;
        //souts the converted answer.
        System.out.println(squareMeter + "square meters converted is " + squareToPing + " " + "ping");
    }
}
