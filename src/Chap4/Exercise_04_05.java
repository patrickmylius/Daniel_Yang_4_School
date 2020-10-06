/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 06-10-2020
 */
package Chap4;

import java.util.Scanner;

/**
 * Geometry: area of a regular polygon
 */
//Wrote a program that prompts the user to enter
//the number of sides and their length of a regular polygon
//and displays its area.

public class Exercise_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompts user to input number of sides
        //sets to int "n"
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        //prompts user to input side length
        //sets to double "s"
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        //computes area with inputs
        //souts result.
        double area = (n * (Math.pow(s, 2))) / (4 * (Math.tan(Math.PI / n)));
        System.out.println(area);


    }
}
