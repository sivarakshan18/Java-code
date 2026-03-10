package test;

public class Employee {
	
	 public static void display(int a,String name,double sal) {
		 
		  System.out.println(a+" ID");
		  System.out.println(name+" Employee Name");
		  System.out.print(sal+" Employee salary");
	 }
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Employee emp=new Employee();
       emp.display(1, "preethi", 4000);
       
	}

}
