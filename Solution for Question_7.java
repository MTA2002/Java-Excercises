/*
Question:You have three identical prizes to give away and a pool of 30 finalists. The finalists are
assigned numbers from 1 to 30. Write a program to randomly select the numbers of three
finalists to receive a prize. Make sure not to pick the same number twice. For example,
picking finalists 3, 15, 29 would be valid but picking 3, 3, 31 would be invalid because
finalist number 3 is listed twice and 31 is not a valid finalist number.
*/
//Solution:
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] prize_values=new int[3];
      do{
          for (int i=0;i<3;i++){
              prize_values[i]=(int)(Math.random()*30);
              if(prize_values[i]==0){
                  prize_values[i]++;
              }
          }

          if(prize_values[0]!=prize_values[1] &&prize_values[1]!=prize_values[2] && prize_values[0]!=prize_values[2]){
              System.out.println("Congratulations the winners are "+prize_values[0]+" "+ prize_values[1]+" "+prize_values[2]);
          }

      }while (prize_values[0]==prize_values[1] || prize_values[1]==prize_values[2] || prize_values[0]==prize_values[2]);
    }
}
