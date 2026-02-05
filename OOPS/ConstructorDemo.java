package OOPS;
class Diementsions{
	int n1;
	int n2;
	int result;
	public Diementsions(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;	
	}
	void display() {
		result=n1+n2;
		System.out.println("Sum:"+result);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diementsions obj=new Diementsions(2,4);
		obj.display();
		

	}

}
