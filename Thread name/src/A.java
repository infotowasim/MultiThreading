
public class A {

	public static void main(String[] args) throws Exception {
		
          Thread thread=new Thread(()->{
  			for(int i=0; i<=5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"wasim Thread");
          
          Thread thread2=new Thread(()-> {
  			for(int i=0; i<=5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"mithu Thread");
          
//          thread.setName("wasim Thread");
//          thread2.setName("mithu Thread");
          
          System.out.println(thread.getName());
          System.out.println(thread.getName());
          
          
          
          
          
          
          thread.start();
          try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
          thread2.start();
          
         
          
          thread.join();
          thread2.join();
          
          System.out.println(thread2.isAlive());
          
          System.out.println("Bye");
          
	}

}
