package Chap1;
// (Population projection) The U.S Census Bereau projects population based on the following assumptions:
// One birth every 7 seconds, One death every 13 seconds and one new immigrant every 45 second.
// Write a program to display the popolation for each of the next five years.
// Assusme that the current population is 312,032,486, and one year has 365 days.


public class Exercise_01_11 {
    public static void main(String[] args) {
        double currentPopu = 312032486;

        System.out.println("Current population is: " + currentPopu);
        System.out.println("Formula to find projection for 1 year is: ");
        System.out.println("Current population + ((births per year) - (deaths per year)" +
                "+ new immigrants per year)) * year");

        //double birthsPerYear =

    }
}
