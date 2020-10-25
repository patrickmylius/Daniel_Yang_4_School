/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap9.Exercise_09_01;

public class Rectangel {

    double width = 1;
    double height = 1;

    Rectangel() {
    width = 4;
    height = 40;
    }

    Rectangel(double newWitdh, double newHeight) {
    width = newWitdh;
    height = newHeight;
    }

    double getArea() {
       return width * height;
    }

    double getPerimeter() {
        return width + width + height + height;
    }
}
