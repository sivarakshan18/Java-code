package test;

public class Product {

	
	public void showProduct(int a,String name,float price){
		
		System.out.println("pen SI no"+ a);
		System.out.println("Brand name"+ name);
		System.out.println("Brand price"+ price);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Product prot=new Product();
	    prot.showProduct(1,"Pen",20.098f);

	}

}
