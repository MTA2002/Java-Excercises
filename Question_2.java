import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list1 =new int[5];
        int[] templist =new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the elements of the list: ");
        int n=0;
        while (n<5){
            list1[n]=scanner.nextInt();
            n++;
        }

        for (int i=0;i<n;i++){
            templist[i]=list1[i];
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(templist[i]>templist[j]){
                    int temp;
                    temp=templist[i];
                    templist[i]=templist[j];
                    templist[j]=temp;

                }
            }
        }

        int check=1;
        for (int i=0;i<n;i++){
            if (list1[i]==templist[i]){

            }
            else {
                check=0;
            }
        }
        if(check==0){
            System.out.println("Array is not sorted!");
        }
        else {
            System.out.println("Array is Sorted");
        }


    }
}
