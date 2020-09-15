package Chap2;
// (Population projection) Rewrite programmer exercise 1.11 to prompt the user
// to enter the number of years and display the population after the number of years.

import java.util.Scanner;

public class Exercise_02_11 {
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
        long totalAyear = ((birthsPerYear + immigrants) - deathsPerYear);
        System.out.println("Total increase in population each year is: " + totalAyear);
        //Sets scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter years to see total population: ");
        //sets input to be years
        long years = input.nextInt();
        //formula for formula to find total population each year.
        long totalPopulation = (totalAyear * years) + currentPopu;
        //souts result
        System.out.println("Total population in " + years + " years " + " is: " + totalPopulation);
    }

}

