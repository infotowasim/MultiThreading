//Modifying Program or Reduce line of code using Anonymous Class and Lambda Expression

public class MyThread1 {
	
	public static void main(String[] args) {
		
		Runnable obj1=()-> {                                //Using Lambda and Anonymous class 
				for(int i=1; i<=5; i++) {
					System.out.println("Hi");					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) { }
				}
		      };
				
				
		Runnable obj2=()-> {                             //Using Lambda and Anonymous class
				for(int i=1; i<=5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) { }
				}	
			};
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
	}

}

