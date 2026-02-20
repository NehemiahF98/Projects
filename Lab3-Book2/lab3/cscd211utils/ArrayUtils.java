package cscd211utils;

import java.io.PrintStream;

public class ArrayUtils<T> {
  public static <T> void printArray(Object[] myArray, PrintStream fout) {
    if (myArray == null || myArray.length < 1 || fout == null)
      throw new IllegalArgumentException("Bad params printArray"); 
    String str = "[\n";
    for (int x = 0; x < myArray.length - 1; x++)
      str = String.valueOf(str) + myArray[x] + ",\n\n"; 
    str = String.valueOf(str) + myArray[myArray.length - 1] + "\n]";
    fout.println(str);
  }
}