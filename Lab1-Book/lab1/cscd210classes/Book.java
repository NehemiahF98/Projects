package lab1.cscd210classes;

import java.util.Objects;

public final class Book implements Comparable<Book>{

   private String author;
   private String isbn;
   private int pages;
   private String title;
   
   public Book(final String title, final String isbn, final int pages, final String author){
   
      if(title == null || isbn == null && pages < 1 && author == null){
         throw new IllegalArgumentException();
      }
      
      this.title = title;
      this.isbn = isbn;
      this.pages = pages;
      this.author = author;
   
   }
   
   public java.lang.String getISBN(){
      return this.isbn;
   }
   
   public int getPages(){
      return this.pages;
   }
   
   @Override
   public java.lang.String toString(){
      String str = "Title: " + this.title + "\nAuthor: " + this.author + "\nISBN: " + this.isbn + "\nPages: " + this.pages;
      return str;
   }
   
   @Override
   public int hashCode(){
      return Objects.hash(author, isbn, pages, title);
   }
   
   @Override
   
   public boolean equals(Object obj){
   if (obj == this) return true;
   if (obj == null) return false;
   if((!(obj instanceof Book))) return false;
   Book book = (Book) obj;
   return pages == book.pages && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title);
   }
   
   public int compareTo(Book another){
      if(another == null){
         throw new IllegalArgumentException();
      }
      
      if(this.author.compareTo(another.author) == 0){
         if(this.title.compareTo(another.title) == 0){
            if(this.pages - another.pages == 0){
               return this.isbn.compareTo(another.isbn);
            }
            return Integer.compare(this.pages, another.pages);
         }
         return this.title.compareTo(another.title);
      }
      return this.author.compareTo(another.author);
   }
   
   
   
   
   
   
  }//end of class