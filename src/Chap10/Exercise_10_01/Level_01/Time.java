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
    Date currentTime = new Date();

    int hour;
    int minute;
    int second;


    private void returnCurrentTime() {
        currentTime.getTime();
        
        this.hour = currentTime.getHours();
        this.minute = currentTime.getMinutes();
        this.second = currentTime.getSeconds();
        System.out.println("Clock is: " + hour + ":" + minute + ":" + second);


    }

    Time() {
        returnCurrentTime();
    }


    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println(time1.currentTime);

    }
}
