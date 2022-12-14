/*
Question:Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, and 
finds the first row and column with the most 1s. Here is a sample run of the program:
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2
*/
//Solution

import java.util.*;

public class Main {
    public static void main(String[] args) {

       int[][] matrix= new int[4][4];
       for (int i=0;i<4;i++){
           for (int j=0;j<4;j++){
               double temp;
               temp=Math.random();
               if (temp>=0.5){
                   temp+=0.5;
               }
               matrix[i][j]=(int) temp;
           }
       }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int first_row_counter=0,final_row_counter=0,row_index=0;
        int first_col_counter=0,final_col_counter=0,col_index=0;
        for (int i=3;i>=0;i--){
            first_row_counter=0;
            for (int j=0;j<4;j++){
                if(matrix[i][j]==1){
                  first_row_counter+=1;
              }
              if (final_row_counter<=first_row_counter){
                  final_row_counter=first_row_counter;
                  row_index=i;
              }
            }
        }
        for (int i=3;i>=0;i--){
            first_col_counter=0;
            for (int j=0;j<4;j++){
                if(matrix[j][i]==1){
                    first_col_counter+=1;
                }
                if (final_col_counter<=first_col_counter){
                    final_col_counter=first_col_counter;
                    col_index=i;
                }
            }
        }
        System.out.println("The largest row index: "+row_index);
        System.out.println("The largest column index: "+col_index);

    }
}
