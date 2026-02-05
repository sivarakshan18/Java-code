package AdvanceConcept;

class Count{
	private int count;
	public synchronized void increment() {
		count++; 
	}
	public int getCount() {
		return count;
	}
}
public class ThreadSynchronize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Count c=new Count();
		
		Thread t1=new Thread(()->
		{
				for(int i=0;i<1000;i++) {
					c.increment();
				}
		}
		);
		t1.start();
		Thread t2=new Thread(()->
		{
			for(int i=0;i<1000;i++) {
				c.increment();
				
			}
	},"Second Thread");
		t2.start();		
		t1.join();
		t2.join();
		System.out.println(c.getCount());
		




	}

}
