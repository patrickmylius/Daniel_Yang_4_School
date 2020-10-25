/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap9.Exercise_09_02;

public class TestStock {
    public static void main(String[] args) {
        //Create object stock1 with symbol ORCL, name Oracle Corporation
        //Show price change percentage between two doubles.
        //Show if decreasing or increasing number
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        System.out.println("Symbol: " + stock1.symbol);
        System.out.println("Name: " + stock1.name);
        System.out.println("The price change percentage is: " + stock1.getChangePercent(34.5, 34.35) + "%");
        System.out.println(stock1.decreaseOrIncrease(stock1.previousClosingPrice, stock1.currentPrice));
        System.out.println("\n");

    }
}
