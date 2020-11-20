/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    //Creating a MyDate object for current date
    MyDate() {
        //GregorianCalendar is a concrete subclass
        // (one which has implementation of all of its inherited members either frominterface or abstract class)
        // of a Calendar that implements the most widely used Gregorian Calendar with which we are familiar.
        GregorianCalendar calendar = new GregorianCalendar();

        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

    }
    //Creates MyDate obj, with specified elapsed time.
    MyDate(long elapsed) {
        setDate(elapsed);
    }

    //getter for year
    public int getYear() {
        return year;
    }

    //getter for month
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    //Getter for day
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    //Method creating new date for obj, using elapsed
    public void setDate(long elapsed) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsed);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
