
public class Company {
	int n;
	
	boolean f=false;
	
	//f=false; chance for Producer
	//f=true; chance for Consumer
	public synchronized void produce_item(int n) throws Exception {
		if(f) {
			wait();
		}
		this.n=n;
		System.out.println("Produced:"+this.n);
		f=true;
		notify();
		
	}
   
	
	public synchronized int consume_item() throws Exception {
		
		if(!f) {
			wait();
		}
		System.out.println("Consumed:"+this.n);
		f=false;
		notify();
		return this.n;
		
		
	}
	
}
