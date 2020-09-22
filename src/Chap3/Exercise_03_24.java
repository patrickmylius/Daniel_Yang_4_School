package Chap3;

import java.util.Random;

/**
 * (GAME: PICK A CARD)
 */
// Write a orogram that simulates picking a card from a deck of 52 cards.
// Your program should display the rank (Ace, 2, 3, 4 , 5, 6, 7, 8, 9, 10, Jack, Queen, King)
// and suit (Clubs, Diamonds, Hearts, Spades) of the card.
public class Exercise_03_24 {
    public static void main(String[] args) {
        userInterface();

    }

    //Method that picks a random card from the 13 possible ranks
    public static String getRandomRank(String[] array) {
        int randomRank = new Random().nextInt(array.length);
        return array[randomRank];
    }

    //Method that picks a random card from the 4 possible suits
    public static String getRandomSuit(String[] array) {
        int randomSuit = new Random().nextInt(array.length);
        return array[randomSuit];
    }

    //Method called in main, uses getRandomSuit method and getRandomRank method.
    //souts chosen card to user.
    static void userInterface() {
        System.out.println("Pick a random card ");
        //declares 2x arrays rank and suit.
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        //Calls for getRandomSuit method and getRandomRank method, and sets them to suitCard and rankCard.
        String suitCard = getRandomSuit(suit);
        String rankCard = getRandomRank(rank);
        //souts the random card chosen from the pool
        System.out.println("The card you picked is: " + rankCard + " of " + suitCard);

    }

}