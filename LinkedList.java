public class LinkedList<T extends Comparable <T>>
{
   private class Node
   {
      public T data;
      public Node next;

      public Node(final T data)
      {
        this.data = data;
        this.next = null;
      }
      
   }// end class Node

   private Node head;
   private int size;
   
   public LinkedList()
   {
      this.head = new Node(null);  // Look Here
      this.size = 0;
   }
   
   // Your code goes below
   
  /**
   * Inserts the specified element at the specified position in this list. 
   * Shifts the element currently at that position (if any) and any
   * subsequent elements to the right (adds one to their indices).
   * @param index The index at which the element is to be inserted
   * @param item The element to be inserted
   * @throws IndexOutOfBoundsException if the index is out of range
   * index less than 0 or index greater than size
   */
   public void add(final int index, final T item)
   {
    if(item == null){
         throw new IllegalArgumentException("The arrray cant be null");
      }else if(index < 0 || index > size){
         throw new IndexOutOfBoundsException();//("the index has to be less then 0 and the index shouldnt be greater than the suze you input");
      }

      Node relevant = this.head.next;

      for(int i = 0; i < index - 1; i++){
         relevant = relevant.next;
      }

      Node seasonal = relevant.next;
      Node nodesOfNew = new Node(item);
      relevant.next = nodesOfNew;
      nodesOfNew.next = seasonal;
   
   }
   
  /**
   * Removes the last occurrence of the specified element in this list 
   * (when traversing the list from head to tail). 
   * If the list does not contain the element, it is unchanged.
   * @param item The element to be removed from this list, if present
   */ 
   public void removeLastOccurrence(final T item)
   {
      Node previous = this.head;
      
         Node relevant = this.head.next;
         Node previousNode = null;
         Node one = null;
        

         while (relevant != null){

            if(relevant.data.equals(item)){
               one = relevant; 
               previousNode = previous;
            }

            previous = relevant;
            relevant = relevant.next;
         }
         if(one == null){
            
         }

         one.next = previousNode.next;
         this.size--;


      }  
   
}// end class