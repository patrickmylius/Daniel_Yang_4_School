/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 06-11-2020
 */
package Chap10.Exercise_10_01.Level_01;

import java.util.Date;

public class Time {
    //create object CurrentTime, holds Date
    Date currentTime = new Date();
    //data fields, hour, minute and second
    int hour;
    int minute;
    int second;

    //Method, returning hour, minute and second.
    private void returnCurrentTime() {
        this.hour = currentTime.getHours();
        this.minute = currentTime.getMinutes();
        this.second = currentTime.getSeconds();
    }
    //no arg construct, returns current time
    Time() {
        returnCurrentTime();
    }


    public static void main(String[] args) {
        //Object time1 with current time.
        Time time1 = new Time();
        System.out.println("Clock is: " + time1.hour + ":" + time1.minute + ":" + time1.second);

    }
}
