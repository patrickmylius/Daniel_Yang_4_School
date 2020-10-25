/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */

/**********************************************************************************
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:*
 *                                                                                 *
 * ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to   *
 *   denote the fan speed.                                                         *
 * ■ A private int data field named speed that specifies the speed of the fan (the *
 *   default is SLOW).                                                             *
 * ■ A private boolean data field named on that specifies whether the fan is on    *
 *   (the default is false).                                                       *
 * ■ A private double data field named radius that specifies the radius of the fan *
 *   (the default is 5).                                                           *
 * ■ A string data field named color that specifies the color of the fan           *
 *   (the default is blue).                                                        *
 * ■ The accessor and mutator methods for all four data fields.                    *
 * ■ A no-arg constructor that creates a default fan.                              *
 * ■ A method named toString() that returns a string description for the fan. If   *
 *   the fan is on, the method returns the fan speed, color, and radius in one     *
 *   combined string. If the fan is not on, the method returns the fan color and   *
 *   radius along with the string “fan is off” in one combined string.             *
 *   the second object. Display the objects by                                     *
 * invoking their toString method.                                                 *
 /*********************************************************************************/

package Chap9.Exercise_09_08;

public class TestFan {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        //Creating two fan objects
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        //Assign fan1 speed, radius, color
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setFanColor("Yellow");
        fan1.powerOn();

        //Assign fan2 speed, radius, color
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setFanColor("Blue");
        fan2.powerOff();

        //Display objects, invoking toStrings() methods
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
