package AdvanceConcept;

public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1=new Thread(()->
		{
				for(int i=0;i<5;i++) {
					System.out.println("Hii");
					try {Thread.sleep(1000);} catch (InterruptedException e) {}
				}
		}
		);
		t1.start();
		try {Thread.sleep(500);} catch (InterruptedException e) {}
		Thread t2=new Thread(()->
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
	},"Second Thread");
		t2.start();
		t1.setName("first Thread");
		System.out.println(t1.isAlive());
		
		System.out.println("name --> "+t1.getName());
		System.out.println("name --> "+t2.getName());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		t1.join();
		t2.join();
		System.out.println("Good Evening.....");


	}

}
