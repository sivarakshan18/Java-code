package AdvanceConcept;



public class RunnableDemo {

	public static void main(String[] args) {
		Thread t1=new Thread(()->
		{
				for(int i=0;i<5;i++) {
					System.out.println("Hii");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						
					}
				}
		}
		);
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		Thread t2=new Thread(()->
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
			}
	});
		t2.start();

	}

}
