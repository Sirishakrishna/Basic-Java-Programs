

import java.awt.Rectangle;
import java.util.Stack;

public class stack {

	 public static void main(String[] args) {
			
		 Stack<String> strTeams  = new Stack<String>();
		 strTeams.push("England");
		 strTeams.push("Australia");
		 strTeams.push("Bangladesh");
		 strTeams.push("Pakistan");
                  strTeams.push("India");
		 strTeams.pop();
                 strTeams.peek();
		 int n1=strTeams.size();
		 
		 Stack<Rectangle> recSquares = new Stack<Rectangle>();
		 recSquares.push(new Rectangle(5,5));
		 recSquares.push(new Rectangle(6,6));
		 recSquares.push(new Rectangle(7,7));
		 

		 
		 while(!strTeams.isEmpty())
			 System.out.println(strTeams.pop());
                 
		 while(!recSquares.isEmpty()){
			 Rectangle rec = recSquares.pop();
			 System.out.println("area: " + rec.width * rec.height);
		 }
			 
		

		 
	}
		

}
