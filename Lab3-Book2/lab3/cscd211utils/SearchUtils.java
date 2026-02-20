package cscd211utils;

public class SearchUtils<T> {
  public static <T> int linearSearch(Object[] array, T target) {
    if (array == null || target == null || array.length < 1)
      throw new IllegalArgumentException("Bad Params linearSearch"); 
    for (int x = 0; x < array.length; x++) {
      if (array[x].equals(target))
        return x; 
    } 
    return -1;
  }
}