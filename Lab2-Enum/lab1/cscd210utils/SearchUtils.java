package lab1.cscd210utils;

public class SearchUtils<T extends Comparable<? super T>> {
  public static <T extends Comparable<? super T>> int linearSearch(T[] array, T target) {
    if (array == null || array.length < 1 || target == null)
      throw new IllegalArgumentException("Bad params linearSearch"); 
    for (int x = 0; x < array.length; x++) {
      if (array[x].equals(target))
        return x; 
    } 
    return -1;
  }
}
