package Lambdas;

public class Thread {
	public static void main(String[] args) {
			Runnable t = new Runnable() {
				public void run() {
					for (int i=0; i<60 ;i++) {
						System.out.println(i);
						
					}
				}

			};
			
			Thread t1 = new Thread();
			
			
			
	}
}
