package lab3.cscd211comparators;

import lab3.cscd211classes.Book;

import java.util.Comparator;

public class FirstAuthorSort implements Comparator<Book> {

    public FirstAuthorSort(){
    }
    
    @Override
    public int compare(final Book b1, final Book b2){
      return b1.getFirstAuthor().compareTo(b2.getFirstAuthor());
    }

}