
import java.util.HashMap;



public class hashmapex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//try small numbers like 2, or 11
		HashMap<Integer,String> strCities = new HashMap<Integer,String>(7);
		
		//will not allow dups
		strCities.put(60001,"Chicago");
		strCities.put(60001,"Evanston");
		strCities.put(20001,"New York");
		strCities.put(90001,"Los Angeles");
		strCities.put(99998,"Shanghai");
		strCities.put(99999,"Moscow");
		strCities.put(99999,"Moscow");
		
		System.out.println(strCities);
		
	
		
		
		

	}

}
