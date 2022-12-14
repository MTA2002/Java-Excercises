/*
Question:Suppose that the tuition for a university is $10,000 this year and increases 5% every year. 
In one year, the tuition will be $10,500. Write a program that computes the tuition in ten 
years and the total cost of four years’ worth of tuition after the tenth year.
*/
//Solution
import java.util.*;

public class Main {
    public static void main(String[] args) {

       int tuition_fee=10000;
       int total_tuition_fee_after10yrs=0;
       int totalcostoftiuition_after4yrs=0;
       for (int i=0;i<14;i++){
           tuition_fee+=tuition_fee*0.05;
           if(i==9){
               total_tuition_fee_after10yrs=tuition_fee;
           }
           if(i>9){
               totalcostoftiuition_after4yrs+=tuition_fee;
           }
       }

        System.out.println("The tuition fee after 10 years will be "+total_tuition_fee_after10yrs);
        System.out.println("The total cost of tuition after 10 years will be "+ totalcostoftiuition_after4yrs);

    }
}
