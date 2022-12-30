/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Adam
 */

class Calculator{
    private int operand_1,operand_2;
    private int result=0;
    public int addition(int operand_1,int operand_2){
        this.operand_1=operand_1;
        this.operand_2=operand_2;
        result=this.operand_1+this.operand_2;
        return result;
    }
    public int subtraction(int operand_1,int operand_2){
        this.operand_1=operand_1;
        this.operand_2=operand_2;
        result=this.operand_1-this.operand_2;
        return result;
    }
    public int multiplication(int operand_1,int operand_2){
        this.operand_1=operand_1;
        this.operand_2=operand_2;
        result=this.operand_1*this.operand_2;
        return result;
    }
    public int division(int operand_1,int operand_2){
        this.operand_1=operand_1;
        this.operand_2=operand_2;
        result=this.operand_1/this.operand_2;
        return result;
    }

}

public class Main {

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int choice,result_of_operation=0;
        int first_number,second_number;
        do {
            System.out.println("Welcome to Calculator Demo!");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 to Exit the program ");
            System.out.println("Please Input your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the first Number: ");
                    first_number=scanner.nextInt();
                    System.out.println("Enter the second Number: ");
                    second_number=scanner.nextInt();
                    result_of_operation=calc.addition(first_number,second_number);
                    System.out.println("The sum of the two numbers is "+ result_of_operation);
                    break;
                case 2:
                    System.out.println("Enter the first Number: ");
                    first_number=scanner.nextInt();
                    System.out.println("Enter the second Number: ");
                    second_number=scanner.nextInt();
                    result_of_operation=calc.subtraction(first_number,second_number);
                    System.out.println("The differnce of the two numbers is "+ result_of_operation);
                    break;
                case 3:
                    System.out.println("Enter the first Number: ");
                    first_number=scanner.nextInt();
                    System.out.println("Enter the second Number: ");
                    second_number=scanner.nextInt();
                    result_of_operation=calc.multiplication(first_number,second_number);
                    System.out.println("The product of the two numbers is "+ result_of_operation);
                    break;
                case 4:
                    System.out.println("Enter the first Number: ");
                    first_number=scanner.nextInt();
                    System.out.println("Enter the second Number: ");
                    second_number=scanner.nextInt();
                    result_of_operation=calc.division(first_number,second_number);
                    System.out.println("The quotient of the two numbers is "+ result_of_operation);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please enter a number in the range of 1-5");
            }
        }while (choice!=5);
    }


}
