package Chap2;
// (Current time)
import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[] args) {
        //sets Scanner to input
        Scanner input = new Scanner(System.in);
        //souts user to enter the specific offset + or -
        System.out.println("Enter the time zone offset to GMT: ");
        //sets console input to gmt
        int gmt = input.nextInt();
        //sets current system time to totalMiliseconds
        long totalMilliseconds = System.currentTimeMillis();
        //declare variables and computing currentTime
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        //declares the offSet to find new currentTime
        long offSet = (currentHour + 2) + gmt;
        //souts answers
        System.out.println("The current time here is: " + (currentHour + 2) + ":" + currentMinutes + ":" + currentSecond);
        System.out.println("The current time, with offset is: " + offSet + ":" + currentMinutes + ":" + currentSecond);
    }
}
