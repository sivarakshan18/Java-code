package test;

public class Biggest {
	static int a=20;
    static int b=80;
	static int c=19;
	 public static void biggest() {
		 if(a>b) {
				if (a>c) {
					System.out.println(a + "is biggest");
				}
				else  {
				System.out.println(c+"is biggest");
				}
			}
			
			else {
				if(b>c) {
					System.out.println(b+ "is biggest");
				}
				
			}
			 
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Biggest big =new Biggest();
		big.biggest();
   
	}

}
