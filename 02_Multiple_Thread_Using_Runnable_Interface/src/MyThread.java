//Creating Thread Using Runnable Interface

class Hi implements Runnable {    
	  @Override 
	  public void run() {
		  for(int i=1; i<=5; i++) {
	    	System.out.println("Hi");
	    	
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	 }
}

class Hello implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
		System.out.println("Hello");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
	  }
   }
}


public class MyThread {
	public static void main(String[] args) {
		
		Runnable obj1=new Hi();
		Runnable obj2=new Hello();
		
		Thread t1=new Thread(obj1);   // done link obj1 with Thread
		Thread t2=new Thread(obj2);   // done link obj2 with Thread
		
		t1.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
	}

}
