package InterFaceConcept;

@FunctionalInterface
interface NewInterface{
	int add(int a,int b);
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewInterface obj=(a,b)->a+b	;
		System.out.println(obj.add(88,98));
		

	}

}
