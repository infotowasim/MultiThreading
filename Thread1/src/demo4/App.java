package demo4;

import java.util.Scanner;

class Processore extends Thread{
	
	private volatile boolean running=true;
	
	public void run() {
		while(running) {
			System.out.println("Hi");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void Showdown() {
		running=false;
		
	}
}



public class App {

	public static void main(String[] args) {
		Processore processore1=new Processore();
		processore1.start();
		
		System.out.println("Press return key to stop");
		Scanner scanner=new Scanner(System.in);
		scanner.nextLine();
		
		processore1.Showdown();
	

	}

}
