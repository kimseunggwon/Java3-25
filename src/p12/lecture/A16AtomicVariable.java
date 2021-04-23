package p12.lecture;

public class A16AtomicVariable {
	static int sv;
	
 public static void main(String[] args) {
	Thread t = new Thread(new Runnable()) {
		
		@Override
		public void run() {
			for(int i =0; i <1_000_000; i++) {
				sv++;
			}
		}
	});
	t.start();
	
	for (int i =0; i <1_000_000; i ++) {
		sv++;
  }
	try {
		t.join();
		
	}catch (InterruptedException e ) {
		e.printStackTrace();
	}
	System.out.println(sv);
  }
}
