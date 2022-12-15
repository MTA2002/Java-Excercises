/*
Question:Write a program that plays the Hi-Lo guessing game with numbers. The program should
pick a random number between 1 and 100 (inclusive) and then repeatedly prompt the user
to guess the number. On each guess, report to the user that he or she is correct or that the
guess is high or low. Continue accepting guesses until the user guesses correctly or chooses
to quit. Use a sentinel value to determine whether the user wants to quit. Count the number
of guesses, and report that value when the user guesses correctly. At the end of each game
(by quitting or a correct guess), prompt to determine whether the user wants to play again.
Continue playing games until the user chooses to stop.
*/
//Solution:

import java.util.*;

public class Main {
    public static void main(String[] args) {
         int random_no,guessed_no,guess_count=0;
         random_no=(int)(Math.random()*100);
         if (random_no==0){
            random_no++;
         }
         Scanner scanner=new Scanner(System.in);
         do{

             System.out.println("Welcome to the Hi-Lo guessing game");
             System.out.println("To guess a number press a value from 1-100");
             System.out.println("To Terminate the program press any value less than 1");
             System.out.println("Ok,now guess the number: ");
             guessed_no=scanner.nextInt();
             if (random_no==guessed_no){
                 System.out.println("You have guessed the number correctly, you have guessed "+guess_count+" times");
             }
             else {
                 if (guessed_no>random_no){
                     System.out.println("Your guess is higher");
                 }
                 else {
                     System.out.println("Your guess is lower");
                 }
                 guess_count++;
             }

         }while (guessed_no>=1 && random_no!=guessed_no);

    }
}
