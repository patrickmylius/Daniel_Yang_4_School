/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020 */

/**
 (Assign grades) Write a program that reads student scores, gets the best score,
 and then assigns grades based on the following scheme:

 Grade is A if score is >= best - 5;
 Grade is B if score is >= best - 10;
 Grade is C if score is >= best - 15;
 Grade is D if score is >= best - 20;
 Grade is F otherwise.

 The program prompts the user to enter the total number of students, then prompts
 the user to enter all of the scores, and concludes by displaying the grades. Here
 is a sample run:
 */

package Chap7.Exercise_07_01;
import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        //Sets scanner
        Scanner input = new Scanner(System.in);

        //Prompt user to enter amount of students
        System.out.print("Enter the number of students: ");

        //sets input to array students
        int students[] = new int[input.nextInt()];
        //declare grades, length match student array length
        char grades[] = new char[students.length];

        //Prompt user to enter scores for each student
        System.out.print("Enter " + students.length + " scores: ");
        for (int i = 0; i < students.length; i++) {
            students[i] = input.nextInt();
        }
        //executing getGrades method with inputs
        getGrades(students, grades);

        ///souts result for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + i + " score is " + students[i] + " and grade is " + grades[i]);
        }
    }

    //Method assigning grades based by grading schema
    public static void getGrades(int[] students, char[] grades) {
        for (int i = 0; i < students.length; i++) {
            int best = highScore(students);
            if (students[i] >= best - 5)
                grades[i] = 'A';
            else if (students[i] >= best - 10)
                grades[i] = 'B';
            else if (students[i] >= best - 15)
                grades[i] = 'C';
            else if (students[i] >= best - 20)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }
    }

    //Method highScore, finds and retuns highest score
    public static int highScore(int[] arr) {
        int bestScore = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > bestScore)
                bestScore = arr[i];
        }
        return bestScore;
    }
}
