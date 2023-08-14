
public class A {

	public static void main(String[] args) throws InterruptedException {
      
	   
	    
	    Thread thread1=new Thread(()-> {
	    		for(int i=1; i<=10;i++) {
	    			System.out.println("B Here");
	    			try {
	    				Thread.sleep(500);
	    			} catch (InterruptedException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		}
	    	});
		
	    Thread thread2=new Thread(()-> {
	    		for(int i=1; i<=10;i++) {
	    			System.out.println("C Here");
	    			try {
	    				Thread.sleep(500);
	    			} catch (InterruptedException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		}
	    		
	    	});
	    
	    thread1.setPriority(Thread.MIN_PRIORITY);
	    thread2.setPriority(Thread.MAX_PRIORITY);
	    
	    System.out.println(thread1.getPriority());
	    System.out.println(thread2.getPriority());
	    
	    thread1.start();
	    
	    try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    thread2.start();
	    
	    
	    thread1.join();
	    thread2.join();
	    
	    System.out.println(thread1.isAlive());
	    
	    System.out.println("Bye");
	    
			
	}
}
