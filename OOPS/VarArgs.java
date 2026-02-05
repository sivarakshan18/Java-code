package OOPS;
class VarA{
	int sum=0;
	int add(int k,int ... a) {
		for(int val:a) 
			sum+=val; 
		System.out.println(k);
		

		return sum;
	}
}
public class VarArgs {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		VarA obj=new VarA();
		System.out.println(obj.add(2, 4,5,9));
		

	}

}
