/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap9.Listing_09_01;

public class Circle {
    double radius;

    //Construct a circle with radius 1
    Circle() {
    radius = 1;
    }
    //Construct a circle with a specified radius
    Circle(double newRadius) {
    radius = newRadius;
    }
    //Compute and return the area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }
    //Compute and return the perimeter of this circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    //Set a new radius for a circle
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

