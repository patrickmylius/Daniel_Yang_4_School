/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap9.Exercise_09_02;

public class Stock {
    //Declare vars
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    //Construct Stock with specified symbol and name
    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    //Method computing percentage change between previousClosingPrice and currentprice
    double getChangePercent(double originalNumb, double newNumb) {
        previousClosingPrice = originalNumb;
        currentPrice = newNumb;

        double increase = originalNumb - newNumb;

        return increase / originalNumb * 100;
    }

    //Method running statement, checking if its a decrease or an increasing number.
    String decreaseOrIncrease(double originalNumb, double newNumb) {
        previousClosingPrice = originalNumb;
        currentPrice = newNumb;

        String decreaseOrIncrease;

        if (originalNumb > newNumb) {
            decreaseOrIncrease = "This is a decrease";
        } else {
            decreaseOrIncrease = "This is an increase";
        }

        return decreaseOrIncrease;

    }
}