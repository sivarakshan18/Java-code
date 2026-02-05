
package OtherConcept;
import java.util.*;
public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> values=new ArrayList<>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(10);
		
		//values.add(1, 11);
		//values.set(0, 22);
		
		//System.out.println(values.get(0));
	    
	    
	    while(values.contains(10)) {
	    	values.remove(10);  
	    }
	    System.out.println(values.contains(10 ));
		for(int val:values) {
			System.out.println(val);
		}
		

	}

}
