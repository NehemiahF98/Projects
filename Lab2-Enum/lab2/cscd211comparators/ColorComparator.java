package lab2.cscd211comparators;
import java.util.*;
import lab2.cscd211classes.Person;
import java.util.Comparator;

public class ColorComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2){
    if(p1 == null || p2 == null){
      throw new IllegalArgumentException();
    }

        return p1.getColor().compareTo(p2.getColor());
    }

}
