/**
 * 
 */
package exceptionhandling;

/**
 * @author Chakradhar
 * Using Throwable super class all Exception classes
 *
 */
public class DecideException1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int x=10/0;
		}
		catch (Throwable e) {
			// TODO: handle exception
			System.err.println(e);
		}

	}

}
