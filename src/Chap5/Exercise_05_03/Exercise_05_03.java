/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 01-10-2020
 */
package Chap5.Exercise_05_03;

import java.util.Scanner;

public class Exercise_05_03 {
    public static void main(String[] args) {

        System.out.println("Celcius\t\t\tFahrenheit");
        System.out.println("====================");
        fahrenheit(2);
        for (int x = 0; x <= 200; x++) {
            System.out.print(x);
            System.out.print("\t\t\t");
            System.out.print(fahrenheit(x));
            System.out.println();
        }

    }

    private static double fahrenheit(int x) {
        return x;
    }


    static double fahrenheit(double celcius) {
        return ((5.0 / 9.0) * (celcius + 32));
    }
    }


