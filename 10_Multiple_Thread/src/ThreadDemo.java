class UserThread extends Thread{
	public void run() {
		System.out.println("This is user defined Thread");
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		int x=20+30;
		System.out.println("Sum is:"+x);//50
		
		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println("Current running thread is:"+tname); //main
		
		//Rename of main thread ( MyThread replace to main)
		t.setName("MyMain");
		System.out.println(t.getName()); //MyMain
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Finding main thread id
		System.out.println(t.getId());
		
		//going to start user defined thread 
		UserThread userThread=new UserThread();
		userThread.start();  
		
		
		System.out.println("Program Ended");
	}

}
