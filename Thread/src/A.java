class Hi{
	public void show() {
		for(int i=0; i<=5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello{
	public void show() {
		for(int i=0; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class A {

	public static void main(String[] args) {
		
        Hi hi=new Hi();
        Hello hello=new Hello();
        
        hi.show();
        hello.show();
		
	}

}
