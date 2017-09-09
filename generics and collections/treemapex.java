import java.util.TreeMap;
 
public class treemapex {
     
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("color1", "blue");
        hm.put("color2", "pink");
        hm.put("color3","green");
        System.out.println(hm);
        //getting value for the given key from TreeMap
        System.out.println("Value of second: "+hm.get("color2"));
        System.out.println("Is TreeMap empty? "+hm.isEmpty());
        hm.remove("color3");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: "+hm.size());
    }
}
