package OOPS;

class Outer {
	class Inner{
		void display() {
			System.out.println("In display Method");
		}	
	}
	static class NewInner{
		void disp() {
			System.out.println("In display Method 2");
		}	
		
	}
	private class Local{
		void displ() {
			System.out.println("In display Method 3");
		}	
	}
	void getAccess() {
		Local ob=new Local();
		ob.displ();
		
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();
		
		in.display();
		
		
		Outer.NewInner obj=new Outer.NewInner();
		obj.disp();
		
		
		out.getAccess();
		
		
		

	}

}
