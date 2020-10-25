/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap9.Exercise_09_01;

public class Rectangel {

    //declare width and height
    double width;
    double height;

    //Construct a rectangel with width 4 and height 40
    Rectangel() {
    width = 4;
    height = 40;
    }
    //Construct a rectangel with specified width and height
    Rectangel(double newWitdh, double newHeight) {
    width = newWitdh;
    height = newHeight;
    }
    //Compute and return the area of this rectangel
    double getArea() {
       return width * height;
    }
    //Compute and return the perimeter of this rectangel
    double getPerimeter() {
        return width + width + height + height;
    }
    //Set new height and width for a rectangel
    void setWidthAndHeight(double newWidth, double newHeight) {
        height = newHeight;
        width = newWidth;
    }
}
