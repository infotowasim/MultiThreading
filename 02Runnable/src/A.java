class B implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println("B Here");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


class C implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println("C Here");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class A {

	public static void main(String[] args) {
      
	   
	    
	    Thread thread1=new Thread(new B());
	    Thread thread2=new Thread(new C());
	    
	    thread1.start();
	    
	    try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    thread2.start();
	    
			
	}
}
