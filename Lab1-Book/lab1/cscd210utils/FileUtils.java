package lab1.cscd210utils;

import java.io.File;
import java.util.Scanner;

public class FileUtils {

   private FileUtils(){
   }

    public static int countRecords(java.util.Scanner fin, int linesPer) {
      if(fin == null){
         throw new IllegalArgumentException();
      }
      else if(linesPer <= 0){
         throw new IllegalArgumentException();
      }
      else{
      int count;
         for(count = 0; fin.hasNext(); count++){
            fin.nextLine();
         }
         if(count == 0){
            throw new IllegalArgumentException();
         }
         else{
            return count / linesPer;
         }
      }
    }
    
    public static File openInputFile(java.lang.String filename){
      if(filename == null || filename.isEmpty()){
         throw new IllegalArgumentException();
      }
      else{
         File fileHere = new File(filename);
         if(fileHere.exists()){
            return fileHere;
         }
         else{
            throw new RuntimeException();
         }
      }
    }//end of openInputFile
    
    
    public static File openInputFile(java.util.Scanner kb){
      if(kb == null){
         throw new IllegalArgumentException();
      }
      else{
         String str = null;
         File fin = null;
         
         do{
            System.out.print("Please enter the name of the file: ");
            str = kb.nextLine();
            fin = new File(str);
            if(!(fin.exists())){
               System.out.println("the File you typed in does not exist: ");
            }
         }
         while(!(fin.exists()));
         return fin;
      }
    
    }
}
