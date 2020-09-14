package Chap2;
// (Compute the volume of a triangle)
// Write a program that reads in the length of sides of an equilateral triangle and computes the area and volume using the following formulas:
// area = kvadratrod3 / 4 (length of sides)^2
import java.util.Scanner;

public class Exercise_02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //souts user for an input
        System.out.println("Enter length of sides and height of the Equilateral traingle: ");
        //sets user input to variable double sides
        double sides = input.nextDouble();
        //computes area
        double area = ((Math.sqrt(3) / 4) * (sides * sides));
        //prints the answer
        System.out.println("The area is: " + area);

        //compute volume
        double volume = area * sides;
        //souts volume
        System.out.println("The volume of the Triangular prism is: " + volume);


    }
}
