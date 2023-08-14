
public class Producer extends Thread {

	
Company c;
	
	public void run() {
		
		int i=1;
		while(true) {    // Infinite loop will be Continued
			try {
				this.c.produce_item(i);
			} catch (Exception e1) {
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

	public Producer(Company c) {  //Constructor
		this.c = c;
	}
}
