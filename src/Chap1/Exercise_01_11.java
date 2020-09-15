package Chap1;
// (Population projection) The U.S Census Bereau projects population based on the following assumptions:
// One birth every 7 seconds, One death every 13 seconds and one new immigrant every 45 second.
// Write a program to display the population for each of the next five years.
// Assusme that the current population is 312,032,486, and one year has 365 days.


public class Exercise_01_11 {
    public static void main(String[] args) {
        //sets current population
        long currentPopu = 312032486;
        //souts current population
        System.out.println("Current population is: " + currentPopu);
        //souts formula used.
        System.out.println("Formula to find projection for 1 year is: ");
        System.out.println("Current population + ((births per year) - (deaths per year)" +
                "+ new immigrants per year)) * year");
        //computes births per year, deaths per year and immigrants per year
        long birthsPerYear = ((365 * 60 * 60 * 24) / 7);
        long deathsPerYear = ((365 * 60 * 60 * 24) / 13);
        long immigrants = ((365 * 60 * 60 * 24) / 45);
        //souts births, deaths, immigrants a year
        System.out.println("Births per year is: " + birthsPerYear);
        System.out.println("Deaths per year is: " + deathsPerYear);
        System.out.println("Immigrants per year is: " + immigrants);
        //sets the amount of population increase for a year
        long totalAyear = ((birthsPerYear + immigrants) - deathsPerYear) ;
        System.out.println("Total increase in population each year is: " + totalAyear);
        //souts population for the next 5 years.
        System.out.println("Total population in 1 year will be: " + (totalAyear + currentPopu));
        System.out.println("Total population in 2 years will be: " + ((totalAyear * 2) + currentPopu));
        System.out.println("Total population in 3 years will be: " + ((totalAyear * 3) + currentPopu));
        System.out.println("Total population in 4 years will be: " + ((totalAyear * 4) + currentPopu));
        System.out.println("Total population in 5 years will be: " + ((totalAyear * 5) + currentPopu));
    }
}
