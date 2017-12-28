package MultiThreading;
import static java.lang.Thread.*;

public class ThreadInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Default thread"+t);
		t.setName("threadinfothread");
		System.out.println("Modified Name"+t);
		System.out.println("Execution status"+t.isAlive());
		Thread t1=new Thread();
		System.out.println("Name of thread t1"+t1);
		System.out.println("Execution status of t1"+t1.isAlive());
		System.out.println("Max prio="+Thread.MAX_PRIORITY);
		System.out.println("Min Prio="+MIN_PRIORITY);//Using static import
		

	}

}
