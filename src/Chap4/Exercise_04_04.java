/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 06-10-2020
 */
package Chap4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Geometry: area of a hexagon
 */

//Write a program that prompts user to enter the side of a hexagon
//and displays its area.


public class Exercise_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompts user to input length of sides
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        //computes area with input and sets to "area"
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        //Sets new format
        DecimalFormat df2 = new DecimalFormat("##.##");

        //souts formatted double area
        System.out.println("The area of the hexagon is: " + df2.format(area));
    }
}
