/*
Question:Write a program that simulates a simple slot machine in which three numbers between 0 
and 9 are randomly selected and printed side by side. Print an appropriate statement if all 
three of the numbers are the same or if any two of the numbers are the same. Continue 
playing until the user chooses to stop.
*/
//Solution
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int first_choice;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Welcome to the simulation game!");
            System.out.println("Press 1 to play the game");
            System.out.println("Press 2 to quit");
            System.out.print("Input your choice:");
            first_choice=scanner.nextInt();
            switch (first_choice){
                case 1:
                    int number_1=(int) (Math.random()*10);
                    int number_2=(int) (Math.random()*10);
                    int number_3=(int) (Math.random()*10);
                    System.out.println(number_1+" "+number_2+" "+number_3);
                    if(number_3==number_1 && number_3==number_2 && number_2==number_1){
                        System.out.print("Wow you are a genius!!");
                    } else if (number_3==number_1 || number_3==number_2 || number_2==number_1) {
                        System.out.print("you are still a genius!!");
                    }
                    else{
                        System.out.println("Oops Try Again!!");
                    }
                    break;
                case 2:
                    first_choice=2;
                    break;
                default:
                    System.out.println("Invalid input please try again!!");
                    break;


            }
        }while(first_choice!=2);



    }
}
