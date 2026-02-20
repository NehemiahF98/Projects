package lab2.cscd211classes;
import lab2.cscd211enums.Color;

import java.util.*;


public class Person implements Comparable<Person> {
    private String  ln, fn;
    private Color color;

    public Person(final String fn, final String ln, final Color color){
      if(fn == null || ln == null || color == null){
         throw new IllegalArgumentException();
      }
        this.fn = fn;
        this.ln = ln;
        this.color = color;
   
    }
    
    //@Override
    public int compareTo(Person another){
    
    if(another == null){
      throw new IllegalArgumentException();
    }
    
      if(this.ln.compareTo(another.ln) == 0){
         if(this.fn.compareTo(another.fn) == 0){
            return this.color.compareTo(another.color);
         }
         return this.fn.compareTo(another.fn);
      }
      return this.ln.compareTo(another.fn);
   
    }//end of method
    
    public Color getColor(){
    
      return this.color;
    }
    
    @Override
    public String toString(){
    
      return "first name: " + fn + "\n" + "last name: " + ln +  "\n" + "color: " + color;
    }
    
    
    
    
    
    
    
    
    
    
    
}