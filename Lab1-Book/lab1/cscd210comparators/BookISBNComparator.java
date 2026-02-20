package lab1.cscd210comparators;
import lab1.cscd210classes.Book;

import java.util.Comparator;

public class BookISBNComparator implements Comparator<Book>{

   public BookISBNComparator(){
   }
   
   public int compare(final Book o1, final Book o2){
      int compare = o1.getISBN().compareTo(o2.getISBN());
     
     return compare;
   }


}