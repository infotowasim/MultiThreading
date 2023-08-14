//Another process to make Thread name
public class ThreadDemo2 {

	public static void main(String[] args) throws Exception  // we use throws Exception to handle join 
	{
		
		Thread t1=new Thread(()->{
			
			for(int i=1;i<=5;i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) { }
			}
		},"Hi Thread");                 // set Thread Name
		
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Wasim");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { }
			}
		},"Hello Thread");            // set Thread Name
		
		System.out.println(t1.getName()); // Hi Thread
		System.out.println(t2.getName()); // Hello Thread
		
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
