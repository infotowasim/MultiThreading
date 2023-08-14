class Hii implements Runnable {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Helloo implements Runnable {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class A {

	public static void main(String[] args) {
		
          Hii hi=new Hii();
          Helloo hello=new Helloo();
          
          Thread thread=new Thread(hi);
          Thread thread2=new Thread(hello);
          
          thread.start();
          try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
          thread2.start();
          
	}

}
