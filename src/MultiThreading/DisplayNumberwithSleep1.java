/**
 * 
 */
package MultiThreading;
import MultiThreading.*;

/**
 * @author Chakradhar
 * Making thread group name sleep rather than foreground thread
 *
 */

public class DisplayNumberwithSleep1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th1 t=new Th1();
		System.out.println("Execution status of t before start="+t.isAlive());
		t.start();
		System.out.println("Execution status of t After start="+t.isAlive());
		try{
			Thread.sleep(12000);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Problem in thread execution");
		}
		System.out.println("Execution status of t After completion="+t.isAlive());

	}

}
