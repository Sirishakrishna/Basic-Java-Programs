/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sirisha
 */
import java.util.LinkedList;
public class LLDemo {
    public static void main(String arg[]){
    LinkedList obj=new LinkedList();
   //adding elements to the linked list
   obj.add("pink");
   obj.add("yellow");
   obj.add("pink");
   //adding element at head
   obj.addFirst("orange");
   //adding elements at tail
   obj.addLast("green");
   System.out.println(obj);
   //inserting elements at required index
   obj.add(4, "magenta");
   System.out.println(obj);
   //removing first element
   obj.removeFirst();
   System.out.println(obj);
   //removing last element
   obj.removeLast();
   System.out.println(obj);
   obj.removeFirstOccurrence("pink");
   System.out.println(obj);
   obj.removeLastOccurrence("pink");
   System.out.println(obj);
   LinkedList obj1=new LinkedList();
   obj1.add("roses");
   obj1.add("Lilies");
   //inserting all elements of obj1 in index 2
   obj.addAll(2, obj1);
    System.out.println(obj);

    }
   
    
    
    
}

