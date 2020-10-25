/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap9.Listing_09_01;

import Chap9.Listing_09_01.Circle;

public class TestCircle {
    public static void main(String[] args) {

        //Create a circle with radius 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is: " + circle1.getArea());
        System.out.println("The perimeter of the circle of radius " + circle1.radius + " is: " + circle1.getPerimeter());
        System.out.println("\n");

        //Create a circle with radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is: " + circle2.getArea());
        System.out.println("The perimeter of the circle of radius " + circle2.radius + " is: " + circle2.getPerimeter());
        System.out.println("\n");

        //Create a cirle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is: " + circle3.getArea());
        System.out.println("The perimeter of the circle of radius " + circle3.radius + " is: " + circle3.getPerimeter());
        System.out.println("\n");

        //Modify circle radius
        circle2.setRadius(100);
        System.out.println("The area of the circle of radius " + circle2.radius + " is: " + circle2.getArea());
        System.out.println("The perimeter of the circle of radius " + circle2.radius + " is: " + circle2.getPerimeter());
        System.out.println("\n");

        //Define the circle class with two constructors

    }
}
