/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap9.Exercise_09_08;

public class Fan {
    //Declare vars
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;

    String color;

    //Corstructer set defaults for fan
    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    //Mutator methods
    //sets fan speed
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    //seets fan power on
    public void powerOn() {
        on = true;
    }

    //sets fan power off
    public void powerOff() {
        on = false;
    }

    //sets fan color
    public void setFanColor(String newColor) {
        color = newColor;
    }

    //sets fan radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    //Getter methods / Accessor methods
    //Return speed
    public String getSpeed() {
        String speed = "";
        switch (this.speed) {
            case SLOW:
                speed = "SlOW";
                break;
            case MEDIUM:
                speed = "MEDIUM";
                break;
            case FAST:
                speed = "FAST";
        }
        return speed;
    }

    //return on
    public boolean isPowerOn() {
        return on;
    }

    //return radius
    public double getRadius() {
        return radius;
    }

    //Return Fan Color
    public String getFanColor() {
        return color;
    }

    //Returns description String for fan
    public String toString() {
        if (on == true) {
            return "Fan speed: " + getSpeed() + "\nFan color: " + color + "\nFan radius: " + radius;
        } else return "\nFan color: " + color + "\nFan radius: " + radius + "\nFan is off!";
    }

}
