package AdvanceConcept;

public class ThrowsDemo {
	public void show() throws Exception {
		String str=null;
		System.out.println(str.length());
	}
	public void slave() {
		try {
			show();
		}
		catch(Exception e) {
			System.out.println("Exception.... "+e);
		}
	}
	public static void main(String[] args) {
		ThrowsDemo obj=new ThrowsDemo();
		obj.slave();
		
	}
}
