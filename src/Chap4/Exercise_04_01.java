/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 06-10-2020
 */
package Chap4;

/**
 * Geometry Area of a pentagon
 */
//Write a program that prompts the user to enter
//the length from the center of pentagon to a vertex
//and computes the area of the pentagon.

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_04_01 {
    public static void main(String[] args) {
        //prompts user to input radius
        System.out.print("Enter the length from the center to a vertex: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        //declares side and area
        double side = (2 * r) * Math.sin((Math.PI / 5));
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan((Math.PI / 5)));

        //Sets new format
        DecimalFormat df2 = new DecimalFormat("##.##");
        //souts area with correct format
        System.out.println(df2.format(area));;


    }
}
