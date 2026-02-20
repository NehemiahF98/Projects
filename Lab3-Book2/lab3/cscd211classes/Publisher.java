package lab3.cscd211classes;



public class Publisher implements Comparable<Publisher>{

   private String city;
   private String name;
   
   
   public Publisher(final String name, final String city){
      if(name == null || city == null){
         throw new IllegalArgumentException();
      }
      if(name.isEmpty() || city.isEmpty()){
         throw new IllegalArgumentException();
      }
      
      this.name = name;
      this.city = city;
   }
   
   public int compareTo(final Publisher pi){
      if(pi == null){
         throw new IllegalArgumentException();
      }
      
     
      if(this.name.compareTo(pi.name) == 0){
         return this.city.compareTo(pi.city);
      }
      else{
         return this.name.compareTo(pi.name);
      }
   }
   
   
   public String getPubName(){
      return this.name;
   }
   
   
   public String getPubCity(){
      return this.city;
   }
   
   
   public String toString(){
      return name + " " + city;
   }


}