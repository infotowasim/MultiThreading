// Creating Thread Using Thread Class

class Hi extends Thread{                                 //make class Thread because we need output parralelly
	public void run() {                                 // method should be run(run is a Internal method of Thread)
		for(int i=1; i<=5; i++) {
			System.out.println("Hi");                  // I want to print 5 times Hi
			
			                                          // we use try-catch block for handling Exception
			try {
				Thread.sleep(500);                  // use sleep method to pause few sec for getting output
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread{                        //make class Thread because we need output parralelly
	public void run() {                           // method should be run(run is a Internal method of Thread)
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");        // I want to print 5 times Hello
			
			                                  // we use try-catch block for handling Exception
			try {
				Thread.sleep(500);          // use sleep method for take few sec for getting output
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
	
	public static void main(String[] args) {
		Hi obj1=new Hi();                             //creating object of class Hi
		Hello obj2=new Hello();                      //creating object of class Hello
		
		obj1.start();                              // calling run method
		
		try {
			Thread.sleep(10);                    // you have to create try-catch 
		} catch (InterruptedException e) {           
			e.printStackTrace();                    
		}                                          
		
		obj2.start();                        //calling run method	
	}

}
