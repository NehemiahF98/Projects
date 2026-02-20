package lab1.cscd210utils;

public class SortUtils<T extends Comparable<? super T>> {
  public static <T extends Comparable<? super T>> void selectionSort(T[] array) {
    if (array == null || array.length <= 0)
      throw new NullPointerException("selectionSort bad Params"); 
    for (int start = 0; start < array.length - 1; start++) {
      int min = start;
      for (int search = start + 1; search < array.length; search++) {
        if (array[search].compareTo(array[min]) < 0)
          min = search; 
      } 
      T temp = array[min];
      array[min] = array[start];
      array[start] = temp;
    } 
  }
}
