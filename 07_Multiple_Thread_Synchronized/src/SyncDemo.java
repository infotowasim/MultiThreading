//if you make method Synchronized(Thread Safe) that means only 1 thread can work with this method
//if t1 is working with Increment(method) then t2 has to wait 
//if t1 is working with Increment(method) then t2 has to wait 

class Counter{
	int count;
	                                          //if you make method Synchronized that means only 1 thread can work with this method
	public synchronized void increment() {   //using Synchronized, if t1 execute the increment method then t2 should not execute this
		                                    // using Synchronized, if t2 execute the increment method then t1 should not execute this
		count++;
	}
}
public class SyncDemo {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					c.increment();
				}	
			}
});
		
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increment();
				}				
			}
		});
	
		t1.start();
		t2.start();
		t1.join();  // main should wait for completing t1 job
		t2.join();
		
		
		System.out.println("Count"+c.count);
		
		
	}

}
