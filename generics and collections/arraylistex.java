

import java.util.ArrayList;

public class arraylistex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//delcare a new arrayList and import from java.util
		//here we're using the generic form so we're telling the compiler that
		//this data structure can ONLY hold strings
		ArrayList<String> strNames = new ArrayList<String>();
		
		
		//the nice thing about arrayLists is that their length is indeterminate
		//this type of data structure is known as a vector; it can grow and shrink 
		strNames.add("Roses");
		strNames.add("Lotus");
		strNames.add("Pansies");
		strNames.add("sunflower");
                             
                strNames.remove(3);
		
		//let's iterate over this ArrayList
		for (String str : strNames) {
			System.out.println(str);
		}
		
		
		}
		
		
		
		
		
	}//end main


