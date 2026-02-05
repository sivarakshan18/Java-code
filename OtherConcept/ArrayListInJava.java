package OtherConcept;
import java.util.*;
public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> val=new ArrayList<>();
		val.add(10);
		val.add(20);
		val.add(30);
		//val.remove(0);
		//val.remove(val.indexOf(20));
		//System.out.println(val);
		
		Iterator it=val.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
