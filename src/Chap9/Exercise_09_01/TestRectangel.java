/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap9.Exercise_09_01;

public class TestRectangel {

    public static void main(String[] args) {
        Rectangel rectangel1 = new Rectangel();
        System.out.println("The width of the rectangel is: " + rectangel1.width);
        System.out.println("The height of the rectangel is: " + rectangel1.height);
        System.out.println("The are of the rectangel is: " + rectangel1.getArea());
        System.out.println("The perimeter of the rectangel is: " + rectangel1.getPerimeter());

        Rectangel rectangel2 = new Rectangel(3.5,35.9);
        System.out.println("The width of the rectangel is: " + rectangel2.width);
        System.out.println("The height of the rectangel is: " + rectangel2.height);
        System.out.println("The are of the rectangel is: " + rectangel2.getArea());
        System.out.println("The perimeter of the rectangel is: " + rectangel2.getPerimeter());
    }
}
