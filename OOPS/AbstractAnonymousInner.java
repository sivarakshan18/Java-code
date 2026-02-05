package OOPS;
abstract class Annonymous{
	abstract void disp();
}

public class AbstractAnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annonymous obj=new Annonymous() {
			void disp() {
				System.out.println("Hello world");
			}
		};
		obj.disp();

	}

}
