package lab2.cscd211methods;
import java.util.*;
import lab2.cscd211enums.Color;
import lab2.cscd211classes.Person;

import javax.swing.*;

public class CSCD211Lab2Methods{

   public static int menu(java.util.Scanner kb){
      if(kb == null){
         throw new IllegalArgumentException();
      }
      
      int choice;
      do{
         System.out.println("Please choose the following: ");
         System.out.println("1) Print the array to the screen");
         System.out.println("2) Display all the people that contain a certain color");
         System.out.println("3) Sort the array by color");
         System.out.println("4) Sort the arrray by the 'natural order' ");
         System.out.println("5) Quit");
         System.out.print("Choice ---> ");
         choice = Integer.parseInt(kb.nextLine());
         System.out.println();   
      
      }while(choice < 1 || choice > 5);
         return choice;
 
   }
   
   
   public static Color readColor(java.util.Scanner kb){
      if(kb == null){
         throw new IllegalArgumentException();
      }
      
      String z = null;
      System.out.println("Please enter the name of the Color: ");
      z = kb.nextLine();
      return convertColor(z);
   
   
   }
   
   public static Person[] fillArray(java.util.Scanner fin, final int total){
      if(fin == null || total <= 0){
         throw new IllegalArgumentException();
      }
      
      Person[] personel = new Person[total]; // this is where we create our new array
      
      for(int i = 0; i < personel.length; i++){
         String[] SplitArr = new String[3];
         
         for(int j = 0; j < 3; j++){ // putting information into the new array that will be returned
            String line = fin.nextLine();
            SplitArr[j] = line;
         }
         
         personel[i] = new Person(SplitArr[0], SplitArr[1], convertColor(SplitArr[2]));
      }
      
         return personel;
   }
   
   
   public static void displayAll(Color toFind, Person[] myPeeps){
       if(myPeeps == null){
         throw new IllegalArgumentException();
       }
       
          for(Person person:myPeeps){
            if(person.getColor().equals(toFind))
               System.out.println(person + "\n");
       }
   
   }//end of method
   
   
   public static void printArray(Person[] myPeeps){
      if(myPeeps == null){
         throw new IllegalArgumentException();
      }
      
      for(int i = 0; i < myPeeps.length; i++){
            System.out.println(myPeeps[i]);
        }

   }
   
   
   
public static Color convertColor(final String color){

        if(color == null){
            throw new IllegalArgumentException();
        }

        String c = color.toLowerCase();
        switch(c){

            case "red":     return Color.RED;
            case "blue":    return Color.BLUE;
            case "green":   return Color.GREEN;
            default:    return Color.PURPLE;

        }
        //return color;
    }
}//end of class