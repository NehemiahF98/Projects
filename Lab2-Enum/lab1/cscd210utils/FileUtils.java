package lab1.cscd210utils;

import java.io.File;
import java.util.Scanner;

public class FileUtils {
  public static int countRecords(Scanner fin, int linesPer) {
    if (fin == null)
      throw new IllegalArgumentException("Scanner can't be null"); 
    if (linesPer <= 0)
      throw new IllegalArgumentException("Parameter can't be less than or equal to 0"); 
    int count = 0;
    while (fin.hasNext()) {
      fin.nextLine();
      count++;
    } 
    if (count == 0)
      throw new RuntimeException("Count is 0"); 
    return count / linesPer;
  }
  
  public static File openInputFile(Scanner kb) {
    if (kb == null)
      throw new IllegalArgumentException("Scanner can't be null"); 
    String fn = null;
    File fin = null;
    do {
      System.out.print("Please enter the name of the file ");
      fn = kb.nextLine();
      fin = new File(fn);
      if (fin.exists())
        continue; 
      System.out.println("The file does not exist");
    } while (!fin.exists());
    return fin;
  }
  
  public static File openInputFile(String filename) {
    if (filename == null)
      throw new IllegalArgumentException("filename is null"); 
    if (filename.isEmpty())
      throw new IllegalArgumentException("filename is empty"); 
    File inf = new File(filename);
    if (inf.exists())
      return inf; 
    throw new RuntimeException("File could not be opened");
  }
}
