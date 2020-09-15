package Chap2;
import java.util.Scanner;

// (Multiply the digits in an integer) Write a program that reads an integer between 0 and 999
// and multiplies all the digits in the integer. For example, if an integer is 932, the multiplication
// of all its digits is 54.
public class Exercise_02_06 {
    public static void main(String[] args) {
        //sets scanner to input
        Scanner input = new Scanner(System.in);
        //souts user for console input
        System.out.print("Enter a number between 0 and 1000: ");

        //sets input to variable number
        int number = input.nextInt();
        //If input is 932:
        if (number >= 0 && number <= 99){
            int tiere = number % 10; //sets digits between 10-99 the digit to variable "tiere"
            number /= 10; //removes the 9(3)
            int hundrede = number % 10;//sets digits between 100-999 to variable "hundrede"
            number /= 10; //removes the (9)
            //compute the multiplication of the digits in the integer
            int total = hundrede * tiere;
            System.out.println("The multiplication of all digits in the given number is " + total);
        }
        if(number >= 100 && number <= 999) {
            int under10 = number % 10; //sets digits under 10 to variable "under10"
            number /= 10;      //removes the 93(2)
            int tiere = number % 10; //sets digits between 10-99 the digit to variable "tiere"
            number /= 10; //removes the 9(3)
            int hundrede = number % 10;//sets digits between 100-999 to variable "hundrede"
            number /= 10; //removes the (9)
            //compute the multiplication of the digits in the integer
            int total = hundrede * tiere * under10;
            //souts the answer
            System.out.println("The multiplication of all digits in the given number is " + total);
        } else System.out.println("Number must be between 0 and 999 ");
    }
}
