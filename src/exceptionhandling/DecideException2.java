/**
 * 
 */
package exceptionhandling;

/**
 * @author Chakradhar
 * Using printStackTrace() method
 *
 */
public class DecideException2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int x=10/0;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
