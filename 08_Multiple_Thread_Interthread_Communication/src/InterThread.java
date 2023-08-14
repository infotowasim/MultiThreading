class A{
	int num;
	boolean valueSet=false;
	
	public synchronized void put(int num) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Put:" +num);
		this.num=num;
		valueSet=true;
		notify();
	}
	public synchronized void get() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get:" +num);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable{
	
	A a1;
	
	public Producer(A a1) {
		this.a1 = a1;
		Thread t1=new Thread(this,"Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			a1.put(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Consumer implements Runnable{
	
	A a1;

	public Consumer(A a1) {
		this.a1 = a1;
		Thread t1=new Thread(this,"Consumer");
		t1.start();
	}

	@Override
	public void run() {
		while(true) {
			a1.get();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
public class InterThread {
	public static void main(String[] args) {
		A a1=new A();
		new Producer(a1);
		new Consumer(a1);
	}

}
