
public class Consumer extends Thread {
	
	Company c;
	
	public void run() {
		
		int i=1;
		while(true) {    // Infinite loop will be Continued
			try {
				this.c.consume_item();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			i++;
		}
		
	}

	public Consumer(Company c) {  //Constructor
		this.c = c;
	}
	

}
