import java.util.*;
public class queueex {
  static String newLine = System.getProperty("line.separator");
  public static void main(String[] args) {
     
    //Creating queue would require you to create instannce of LinkedList and assign 
    //it to Queue
    //Object. You cannot create an instance of Queue as it is abstract
    Queue queue = new LinkedList();
    
    //you add elements to queue using add method
    queue.add("India");
    queue.add("Australia");

    queue.add("Kenya");
    queue.add("England");
    queue.add("Scotland");
    
    System.out.println(newLine + "Items in the queue..." + queue + newLine);

    //You remove element from the queue using .remove method
    
    System.out.println("remove element: " + queue.remove() + newLine);
    
   
    System.out.println("retrieve element: " + queue.element() + newLine);
    
    //.poll() method retrieves and removes the head of this queue
    //or return null if this queue is empty. 
    
    System.out.println("remove and retrieve element, null if empty: " + queue.poll() + 
    newLine);
    
    //.peek() just returns the current element in the queue, null if empty
   
    System.out.println("retrieve element, null if empty " + queue.peek() + newLine);
  }
}
