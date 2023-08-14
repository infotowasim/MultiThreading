public class ThreadDemo1 {

	public static void main(String[] args) throws Exception  // we use throws Exception to handle join 
	{
		
		Thread t1=new Thread(()->{
			
			for(int i=1;i<=5;i++) {
				System.out.println("Hi"+ Thread.currentThread().getPriority()); // Hi 1
				try {
					Thread.sleep(1000);
				} catch (Exception e) { }
			}
		});
		
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Wasim"+ Thread.currentThread().getPriority()); // Wasim 10
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { }
			}
		});
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority()); // default normal Priority will give 5 // Min-1
		System.out.println(t2.getPriority()); // default normal Priority will give 5 //Max-10
		
		
		
		t1.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) { }
		
		t2.start();
		
		System.out.println(t1.isAlive());   //True-because t1 thread is running now
		
		t1.join();    //join make will main thread to wait for completing task of thread t1 and t2
		t2.join();   // after that main thread will print Bye at last
		
		System.out.println(t1.isAlive());  //False-because t1 thread is not running . After completing join its dead
		System.out.println("Bye");
	}
}
