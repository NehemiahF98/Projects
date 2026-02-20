package lab3.cscd211utils;

public class SortUtils<T> {
  public static <T extends Comparable<? super T>> void selectionSort(T[] array) {
    if (array == null || array.length <= 0)
      throw new NullPointerException("Comparable selectionSort bad Params"); 
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
  
  public static void selectionSort(int[] myArray) {
    if (myArray == null || myArray.length < 1)
      throw new IllegalArgumentException("Bad params selectionSort"); 
    for (int start = 0; start < myArray.length - 1; start++) {
      int min = start;
      for (int search = start + 1; search < myArray.length; search++) {
        if (myArray[search] < min)
          min = search; 
      } 
      int temp = myArray[start];
      myArray[start] = myArray[min];
      myArray[min] = temp;
    } 
  }
}