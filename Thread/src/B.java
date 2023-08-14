class Hii extends Thread {
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

class Helloo extends Thread{
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


public class B {

	public static void main(String[] args) {
		
          Hii hi=new Hii();
          Helloo hello=new Helloo();
          
          hi.start();
          try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
          hello.start();
          
	}

}
