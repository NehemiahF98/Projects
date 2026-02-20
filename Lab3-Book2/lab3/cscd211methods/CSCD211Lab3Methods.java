package lab3.cscd211methods;

import java.io.*;
import java.util.*;
import lab3.cscd211classes.Book;
import lab3.cscd211classes.Publisher;
import lab3.cscd211enums.Genre;
import lab3.cscd211classes.Author;

public class CSCD211Lab3Methods{


   public static Book[] fillArray(final Scanner fin){
      if(fin == null){
         throw new IllegalArgumentException();
      }

      int[] numOfBooks = new int[1];
      numOfBooks[0] = Integer.parseInt(fin.nextLine());
      
      Book[] book = new Book[numOfBooks[0]];//making a whole new array filling it with the number of books from the integer array that it got from the text 
      for(int i = 0; i < numOfBooks[0]; i++){
         String[] splitArr = new String[7]; //takin the first 7 things from the array and then splitting them up. looping 7 times to fill in the array
         for(int j = 0; j < 7; j++){
         String line = fin.nextLine();
         splitArr[j] = line;
      }

      String[] authors = new String[Integer.parseInt(splitArr[6])];
      for(int k = 0; k < Integer.parseInt(splitArr[6]); k++){
         String nextLine = fin.nextLine();
         authors[k] = nextLine;
      }
      
      Publisher pub = new Publisher(splitArr[5] , splitArr[4]);
      book[i] = new Book(splitArr[0],splitArr[1],Integer.parseInt(splitArr[2]), getGenre(splitArr[3]), pub, authors);
      }
      
      return book;
   }
   
   
   public static Book[] addBook(final Book[] array, final Book book){
      if(array == null || book == null){
         throw new IllegalArgumentException();
      }
      Book []  arr2 = new Book[array.length + 1];//creates new array
      
      for(int i = 0; i < array.length; i++){
         arr2[i] = array[i];
      }
      
      arr2[array.length] = book;
         
      return arr2;   
   }
   
   
   public static Book createBook(final Scanner kb){
      if(kb == null){
         throw new IllegalArgumentException();
      }
      
      
      System.out.println("Please enter the title of the Book: ");
      String title = kb.nextLine();
      System.out.println("Please enter the ISBN of the Book: ");
      String isbn = kb.nextLine();
      System.out.println("Please enter the number of pages: ");
      int pages = Integer.parseInt(kb.nextLine());
      System.out.println("Please enter the genre of the Book: ");
      String type = kb.nextLine();
      System.out.println("Please enter the Publisher of the Book: ");
      String pubName = kb.nextLine();
      System.out.println("Please enter the Publisher city of the Book: ");
      String pubCity = kb.nextLine();
      System.out.println("Please enter the number of authors: ");
      int numAuthor = kb.nextInt();
      kb.nextLine();
      Author[] author = new Author[numAuthor];
      String firstName;
      String lastName;
      
      for(int i = 0; i < numAuthor; i++){
         System.out.println("Please enter the Author's first name: ");
         firstName = kb.nextLine();
         System.out.println("Please enter the Author's last name: ");
         lastName = kb.nextLine();
         author[i] = new Author(firstName, lastName);
      }
      
      
      Book newBook = new Book(title, isbn, pages, type, pubName, pubCity, author);
      return newBook;
   }
   
   
   public static Genre getGenre(final String g) {
        if (g == null || g.isEmpty()) {
            throw new IllegalArgumentException("String is null");
        }
        String genre = g.toLowerCase();
        //same as last lab getting generes
        switch (genre) {
            case "romance":
                return Genre.ROMANCE;
            case "education":
                return Genre.EDUCATION;
            case "nonficton":
                return Genre.NONFICTION;
            case "scifi":
                return Genre.SCIFI;
            default:
                return Genre.FICTION;
        }


    }   
   
   public static int menu(final Scanner kb){
      if(kb == null){
         throw new IllegalArgumentException();
      }
      
      int choice;
      do{
         System.out.println("MENU");
         System.out.println("1. Print the books to the screen.");
         System.out.println("2. Print the books to a file.");
         System.out.println("3. Sort the book using compareTo.");
         System.out.println("4. Sort the books by first author as a Comparator.");
         System.out.println("5. Add a book.");
         System.out.println("6. Quit");
         System.out.print("Choice---->");
         choice = kb.nextInt();
      }while(choice < 1 || choice > 6);
      
      kb.nextLine();
      return choice;
   }
   
   
   public static void printBooks(Book[] array, PrintStream fout){
      if(array == null || fout == null){
         throw new IllegalArgumentException();
      }
      
      int i = 0;
      for(Book book : array){
         fout.println(array[i] + "\r\n");
         i++;
      }
    }
   
   
   
   
   public static String readFileName(final Scanner kb){
      if(kb == null){
         throw new IllegalArgumentException();
      }
      
      String str="";
      do
      {
         System.out.print("Please enter the file name: ");
         str = kb.nextLine().trim();
      }while(str == null || str.isEmpty());
      
      return str;
   }       

}