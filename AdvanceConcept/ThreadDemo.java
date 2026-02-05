package AdvanceConcept;

class Hii extends Thread
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
}
class Hello extends Thread
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hii obj1=new Hii();
		Hello obj2= new  Hello();
		
		obj1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		obj2.start();

	}

}
