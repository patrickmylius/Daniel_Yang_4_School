/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */

/*********************************************************************************
 * (The Rectangle class) Following the example of the Circle class in Section 9.2,*
 * design a class named Rectangle to represent a rectangle. The class contains:   *
 *                                                                                *
 * ■ Two double data fields named width and height that specify the width and     *
 * height of the rectangle. The default values are 1 for both width and height.   *
 * ■ A no-arg constructor that creates a default rectangle.                       *
 * ■ A constructor that creates a rectangle with the specified width and height.  *
 * ■ A method named getArea() that returns the area of this rectangle.            *
 * ■ A method named getPerimeter() that returns the perimeter.                    *
 *                                                                                *
 * Draw the UML diagram for the class and then implement the class. Write a test  *
 * program that creates two Rectangle objects—one with width 4 and height 40      *
 * and the other with width 3.5 and height 35.9. Display the width, height, area, *
 * and perimeter of each rectangle in this order.                                 *
 *********************************************************************************/

package Chap9.Listing_09_01;


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
