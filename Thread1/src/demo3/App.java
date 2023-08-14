// Using Anonymous class

package demo3;

public class App {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Wasim :" +i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}			
			}
		});
		t1.start();
	}

}