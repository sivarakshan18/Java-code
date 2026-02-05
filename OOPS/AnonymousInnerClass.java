package OOPS;

class Animal{
	int legs=4;
	public void show() {
		System.out.println("Total legs="+legs);
	}
}


public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Animal()
		{
			public void show() 
			{
				System.out.println("No legs");
			}
		};
			
		obj.show();

	}

}
