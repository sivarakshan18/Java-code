package OtherConcept;

import java.util.*;;

public class MapInterfaceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> m=new HashMap<>();
		m.put("Siva", 97);
		m.put("kavi", 89);
		m.put("Praveen", 99);
		m.put("Arul", 98);
		
		System.out.println(m.replace("kavi", 89, 0));
		System.out.println(m.containsKey("Siva"));
		System.out.println(m.containsValue(89));
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get("kavi"));
		System.out.println(m.values());
		System.out.println(m.keySet());
		
		for(String key:m.keySet()) {
			System.out.println(key+":"+m.get(key));
		}
		

	}

}
