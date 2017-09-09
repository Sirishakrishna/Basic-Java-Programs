
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistex {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		
		LinkedList<String> strTeams = new LinkedList<String>();
	
		
		strTeams.add("India");
		strTeams.add("Pakistan");
		strTeams.add("Kenya");
		strTeams.add("Scotland");
		strTeams.add("Australia");
		strTeams.add("England");
                String s=strTeams.getFirst();
                String s1=strTeams.getLast();
                System.out.println(s);
                System.out.println(s1);
		Iterator<String> itr =  strTeams.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
			
		}
		

		
		
		

	}
	

}
