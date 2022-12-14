/*
Question:Write a program that reads an integer value representing a year from the user. The purpose 
of the program is to determine whether the year is a leap year (and therefore has 29 days 
in February) in the Gregorian calendar. A year is a leap year if it is divisible by 4, unless it 
is also divisible by 100 but not 400. For example, the year 2003 is not a leap year, but 2004 
is. The year 1900 is not a leap year because it is divisible by 100, but the year 2000 is a 
leap year because even though it is divisible by 100, it is also divisible by 400. Produce an 
error message for any input value less than 1582 (the year the Gregorian calendar was 
adopted).

 */
//Solution:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int condition;
        condition=0;
        do{
        System.out.println("Welcome to the leap year checker program!!");
        System.out.print("Please enter a year value to check if it is a leap year: ");
        int leap_year_value;
        Scanner scanner=new Scanner(System.in);
        leap_year_value=scanner.nextInt();
        if(leap_year_value>=1582){
            if(leap_year_value%100==0 &&leap_year_value%400!=0 || leap_year_value%4!=0){
                System.out.println("The year you entered is not a leap year!!");
            } else if (leap_year_value%400==0) {
                System.out.println("The year you entered is a leap year!!");
            } else if (leap_year_value%4==0) {
                System.out.println("The year you entered is a leap year!!");
            }
            condition=1;
        }
        else{
            System.out.println("The year you entered is not valid!!\nDo you want to enter again(y/n):");
            char choice;
            choice=scanner.next().charAt(0);
            if (choice=='Y'|| choice=='y'){
                condition=0;
            }
            else {
                condition=1;
            }
        }
        }while (condition!=1);

    }
}
