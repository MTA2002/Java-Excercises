/*
Question:Write a program that displays all the numbers from 100 to 200, ten per line, that are 
divisible by 5 or 6, but not both. Numbers are separated by exactly one space.
*/
//Solution
public class Main {
    public static void main(String[] args) {
      int number;
      number=100;
      int count_of_lines=0;
      while (number<=200)
      {
          if(number%5==0 && number%6==0){

          }
          else {
              if (number%5==0) {
                  System.out.print(number +" ");
                  count_of_lines++;
              }
              else if(number%6==0) {
                  System.out.print(number +" ");
                  count_of_lines++;
              }
          }
          if(count_of_lines%10==0){
              System.out.println();
          }

          number++;
      }

    }
}
