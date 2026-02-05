package OtherConcept;
class Outer{
	private class Inner{
		public void show() {
			System.out.println("In show...");
		}
	}
	public void disp() {
		Inner in =new Inner();
		in.show();
	}
}
public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Outer obj=new Outer();
         obj.disp(); 
         
         
	}

}
