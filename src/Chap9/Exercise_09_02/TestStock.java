/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */

/*********************************************************************************
 * (The Stock class) Following the example of the Circle class in Section 9.2,    *
 * design a class named Stock that contains:                                      *
 *                                                                                *
 * ■ A string data field named symbol for the stock’s symbol.                     *
 * ■ A string data field named name for the stock’s name.                         *
 * ■ A double data field named previousClosingPrice that stores the stock         *
 *   price for the previous day.                                                  *
 * ■ A double data field named currentPrice that stores the stock price for the   *
 *   current time.                                                                *
 * ■ A constructor that creates a stock with the specified symbol and name.       *
 * ■ A method named getChangePercent() that returns the percentage changed from   *
 *   previousClosingPrice to currentPrice.                                        *
 *                                                                                *
 * Draw the UML diagram for the class and then implement the class. Write a test  *
 * program that creates a Stock object with the stock symbol ORCL, the name       *
 * Oracle Corporation, and the previous closing price of 34.5. Set a new current  *
 * price to 34.35 and display the price-change percentage.                        *
 *********************************************************************************/

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
