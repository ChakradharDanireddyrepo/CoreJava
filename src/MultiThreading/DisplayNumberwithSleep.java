package MultiThreading;

class Th1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try{
			for (int i = 0; i < 10; i++) {
				System.out.println("Number="+i);
				Thread.sleep(1000);		
			}
		}
			catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Problem in thread execution");
			}
			
		}
	}
public class DisplayNumberwithSleep {
	public static void main(String arg[]){
		Th1 t=new Th1();
		System.out.println("Execution status of thread before calling start="+t.isAlive());
		t.start();
		System.out.println("Execution status of thread after callin start="+t.isAlive());
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Execution status after thread is joined="+t.isAlive());
	}

}
