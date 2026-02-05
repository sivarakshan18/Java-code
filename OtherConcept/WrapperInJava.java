 package OtherConcept;

public class WrapperInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=98;
		Integer obj=new Integer(5);  //boxing
		
		Integer obj1=i;   // auto-boxing
		
		int val=obj1.intValue();  //unboxing
		
		int val1=obj; //auto-unboxing
		
		System.out.println(val1);
		System.out.println(val);

	}

}
