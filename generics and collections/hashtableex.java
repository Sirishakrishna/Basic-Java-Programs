
import java.util.Hashtable;
public class hashtableex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//try small numbers like 2, or 11
		Hashtable<Integer,String> strCities = new Hashtable<Integer,String>(2);
                //Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		
		//will allow duplicates -- watch-out
		strCities.put(1, "Delhi");
               strCities.put(2, "Hyderabad");
               strCities.put(3, "Mumbai");
               strCities.put(4, "Bangalore");
			
		
		System.out.println(strCities);
		System.out.println(strCities.contains("Kakinada"));
	
		
		
		

	}

}
