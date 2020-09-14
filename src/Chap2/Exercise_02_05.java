package Chap2;
// (Financial application) Write a program that reads the subtotal and the gratuity rate and then computes, the gratuity and total.
// For example, if the user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2 as gratuity and $11.2 as total.
import java.util.Scanner;
public class  Exercise_02_05 {
    public static void main(String[] args) {
        //Scanner set to input
        Scanner input = new Scanner(System.in);
        //souts the user to enter subtotal and gratuity rate in console
        System.out.println("Enter the subtotal and a gratuity rate: ");
        //declares variables, user input to subTotal and gratuityRate doubles.
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        //computes gratuity rate and total
        double gratuity = subTotal * (gratuityRate / 100);
        double total = subTotal + gratuity;
        //souts the answer in console
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
