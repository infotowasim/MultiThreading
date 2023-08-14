class Mithu extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Wasim extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Wasim");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Akram extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Akram");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		
		Mithu mithu=new Mithu();
		Wasim wasim=new Wasim();
		Akram akram=new Akram();
		
		mithu.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		wasim.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		akram.start();
		
		
	}

}
