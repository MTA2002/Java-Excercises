/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adam
 */

class Phonebook{
    public int count=0;
    private String name;
    private long phone_number;
    public void set_name(String name){
        this.name=name;
    }
    public String get_name(){
       return name;
    }
    public void set_phone_number(long phone_number){
        this.phone_number=phone_number;
    }
    public long get_phone_number(){
        return phone_number;
    }



    public void  display(ArrayList<Phonebook>phonebook_collection){
        System.out.println("Name\t\t\tPhone number");
       for (int i=0;i<phonebook_collection.size();i++){
            System.out.println(phonebook_collection.get(i).name+"\t\t\t"+phonebook_collection.get(i).phone_number);
       }
    }
    public void search_phone(ArrayList<Phonebook>phonebook_collection,String name){


        int found=0,index=-1;
        for (int i=0;i<phonebook_collection.size();i++){
            if (name.equals(phonebook_collection.get(i).name)){
                found=1;
                index=i;
                break;
            }
        }
        if (found==1){
            System.out.println("The element is successfully found at index "+index);
            System.out.println("The information on the record is as follows: ");
            System.out.println("Name: "+phonebook_collection.get(index).name);
            System.out.println("Phone number: "+phonebook_collection.get(index).phone_number);
        }
        else{
            System.out.println("Oops Record not found!!");
        }


    }
    public void delete_an_element(ArrayList<Phonebook>phonebook_collection,String name){
        int found=0;
        for(int i=0;i<phonebook_collection.size();i++){
            if (name.equals(phonebook_collection.get(i).name)){
                phonebook_collection.remove(i);
               found=1;
                break;
            }
        }
        if (found==1){
            System.out.println("Record Successfully deleted!");
        }
        else {
            System.out.println("Oops Record not found!!");
        }
    }
}
public class Main {

    public static void main(String[] args) {
          ArrayList<Phonebook> phonebook_collection=new ArrayList<Phonebook>();
          Phonebook phonebook=new Phonebook();
          Scanner scanner=new Scanner(System.in);
          String temp_name;
          int choice;
          do {
              System.out.println("1.Add phone book");
              System.out.println("2.Display all phonebook");
              System.out.println("3.Search Phonebook");
              System.out.println("4.Remove Phonebook");
              System.out.println("5.Exit");
              System.out.print("Plese input your choice: ");
              choice=scanner.nextInt();
              switch  (choice){
                  case 1:
                      char choice_2;
                      do{
                          phonebook=new Phonebook();
                          System.out.println("Enter the name of the person: ");
                          long temp_phone_number;
                          scanner.nextLine();
                          temp_name=scanner.nextLine();
                          phonebook.set_name(temp_name);

                          System.out.println("Enter the phone-number of the person:  ");
                          temp_phone_number=scanner.nextInt();
                          phonebook.set_phone_number(temp_phone_number);
                          phonebook_collection.add(phonebook.count,phonebook);
                          System.out.println("Data successfully recorded\nDo you want to add another data(y/n): ");
                          choice_2=scanner.next().charAt(0);
                          phonebook.count++;

                      }while(choice_2=='y' ||choice_2=='Y');
                      break;
                  case 2:
                      phonebook.display(phonebook_collection);
                      break;
                  case 3:
                      System.out.println("Enter the name of the person you want to search: ");
                      scanner.nextLine();
                      temp_name=scanner.nextLine();
                      phonebook.search_phone(phonebook_collection,temp_name);
                      break;
                  case 4:
                      System.out.println("Enter the name of the person you want to remove: ");
                      scanner.nextLine();
                      temp_name=scanner.nextLine();
                      phonebook.delete_an_element(phonebook_collection,temp_name);
                      break;
                  case 5:
                      System.exit(0);
                      break;
              }
          }while (choice!=5);

    }



}
