package InterFaceConcept;
interface Demo{
	
}
class Inter implements Demo{
	void disp() {
		System.out.println("In display method....");
	}
	
}
public class InterfaceSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter obj=new Inter();
		if(obj instanceof Demo)
		   obj.disp();
		else
			System.out.println("Something went wrong");
		

	}

}
