class Rohit extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("Hi Ram");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}

class Ram extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello Rohit");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Boni {

	public static void main(String[] args) {
		Rohit rohit=new Rohit();
		Ram ram=new Ram();
		
		rohit.start();
	    try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ram.start();   
		

	}

}
