/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 05-10-2020
 */
package Chap5.Exercise_05_08;


import java.util.Scanner;

public class UserInterface {
    static Scanner input = new Scanner(System.in);

    static void promptUser() {
        //Prompt user to input int students
        System.out.print("Please enter amount of students: ");
        int numbOfStudents = input.nextInt();
        //prompt user to input student name and score
        System.out.println("Enter each student's name and score\n");
        //declares nameArray and scoreArray
        String nameArray[] = new String[numbOfStudents];
        int scoreArray[] = new int[numbOfStudents];
        //execute fillArrays method
        fillArrays(nameArray, scoreArray);

        System.out.println("Students and Scores are: \n");
        //executes printArray method, with nameArray, scoreArray and numbOfStudents
        //sets return to finalPrint
        int finalPrint = printArray(nameArray, scoreArray, numbOfStudents);

        System.out.println("Highest score achieved amongst students: \n");
        System.out.println(finalPrint);


    }

    //fillArray method, takes userinput and fills array
    static void fillArrays(String[] nameArray, int[] scoreArray) {
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print("Student: " + (i + 1) +
                    "\n   Name: ");
            nameArray[i] = input.next();
            System.out.print("   Score: ");
            scoreArray[i] = input.nextInt();
        }
    }

    //printArray method, takes arrays
    //calls function class and executes computeHighestScore method
    //returns highScoreStudent
    public static int printArray(String[] nameArray, int[] scoreArray, int numbOfStudents) {

        int highScoreStudent = Function.computeHighestScore(scoreArray);
        for (int i = 0; i < numbOfStudents; i++) {
            System.out.println(nameArray[i] + ": " + scoreArray[i] + "\n");


        }
        return highScoreStudent;
    }
}



