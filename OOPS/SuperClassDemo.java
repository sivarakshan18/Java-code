package OOPS;
class Parents{
	int a=10;
	
	Parents(){
		System.out.println("In Parent Constructor");
	}
	Parents(int j){
		System.out.println(j);
	}
}
class Childs extends Parents{
	Childs(){
		System.out.println("In child constructor");
	}
	int a=20;
	Childs(int i){
		super(23);
		System.out.println(i);
		System.out.println("a="+a);
		System.out.println("a="+super.a);
	}
}
public class SuperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childs c=new Childs(43);

	}

}
