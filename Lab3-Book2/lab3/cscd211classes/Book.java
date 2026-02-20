package lab3.cscd211classes;

import java.util.*;
import lab3.cscd211classes.Publisher;
import lab3.cscd211classes.Author;
import lab3.cscd211enums.Genre;
import java.util.Arrays;

public class Book implements Comparable <Book>{
   private Author[] author;
   private String isbn;
   private int pages;
   private Publisher pub;
   private String title;
   private Genre type;
   
   
   
   public Book(final String title, final String isbn, final int pages, final Genre type, final Publisher pub, final String [] author){
      if(title.isEmpty() || isbn.isEmpty() || pages <= 0 ){
         throw new IllegalArgumentException();
      }
      if(title == null || isbn == null || pages < 0 || type == null || pub == null|| author == null){
         throw new IllegalArgumentException();
      }
     
      
      this.title = title;
      this.isbn = isbn;
      this.pages = pages;
      this.type = type;
      this.pub = pub;
      //this.author = author;
   
   }
   
   public Book(final String title, final String isbn, final int pages, final String type, final String pubName, final String pubCity, final Author[] array){
      if(title == null || isbn == null || pages < 0 || type == null || pubName == null|| pubCity == null || array == null){
         throw new IllegalArgumentException();
      }
      if(title.isEmpty() || isbn.isEmpty()|| pages <= 0 || type.isEmpty() || pubName.isEmpty() || pubCity.isEmpty()){
         throw new IllegalArgumentException();
      }
      this.title = title;
      this.isbn = isbn;
      this.pages = pages;
      this.type = Genre.valueOf(type);
      this.pub = new Publisher(pubName, pubCity);
      this.author = new Author[array.length];
      for(int i = 0; i < array.length; i++){
         author[i] = array[i];
      }
   
   }
   
   
   @Override
   public int compareTo(final Book passedIn){
      if(this.pub.compareTo(passedIn.pub) == 0){
         if(this.title.compareTo(passedIn.title) == 0){
            return this.isbn.compareTo(passedIn.isbn);
         }
         return this.title.compareTo(passedIn.title);
      }
      return this.pub.compareTo(passedIn.pub);
   }
   
   
   public boolean equals(Object obj){
      if(obj == null || obj.getClass() != this.getClass()){
         return false;
      }
      if(this == obj || this.hashCode() == obj.hashCode()){
         return true;
      }
      return false;
   }
   
   @Override
   public int hashCode(){
      String pages = String.valueOf(this.pages);
        return this.isbn.hashCode() + this.author.hashCode() + this.title.hashCode() + pages.hashCode();
   }
   
   
   public Author getFirstAuthor(){
      return this.author[0];
   }
   
   
   public String getISBN(){
      return this.isbn;
   }
   
   
   public int getPages(){
      return this.pages;
   }
   
   public String getTitle(){
      return this.title;
   }
  
  
   public Genre getType(){
      return this.type;
   }
   
   
   public void setISBN(final String isbn){
      if(isbn == null || isbn.isEmpty()){
         throw new IllegalArgumentException();
      }
      
      this.isbn = isbn;
   }
   
   
   public void setPages(final int pages){
      if(pages <= 0){
         throw new IllegalArgumentException();
      }
      
      this.pages = pages;
   }
   
   
   public void setTitle(final String title){
      if(title == null || title.isEmpty()){
         throw new IllegalArgumentException();
      }
      
      this.title = title;
   }
   
   @Override
   public String toString(){
      return title + "ISBN: " + isbn;
   }
   
}