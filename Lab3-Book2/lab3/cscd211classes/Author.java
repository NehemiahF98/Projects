package lab3.cscd211classes;
import java.util.*;

public class Author extends Object implements Comparable <Author>{
    private String first,last;

    public Author(String first, String last){
      if(first == null || last == null){
         throw new IllegalArgumentException();
      }
      if(first.isEmpty() || last.isEmpty()){
         throw new IllegalArgumentException();
      }
      
        this.first=first;
        this.last=last;
    }

    @Override
    public int compareTo(Author pi) {
        if(pi == null){ throw new IllegalArgumentException();}

        if(this.last.compareTo(pi.last) == 0){
         if(this.first.compareTo(pi.first) == 0){
            
         }
            return this.first.compareTo(pi.first);
        }
        return this.last.compareTo(pi.last);
    }//end of compareTo

    public String getFirstName(){

        return this.first;
    }

    public String getLastName(){

        return this.last;
    }

    public String toString(){

        return "first name: " + first.toUpperCase() + "\n" + "last name: " + last.toUpperCase() +  "\n" + "Author: ";
    }


}
