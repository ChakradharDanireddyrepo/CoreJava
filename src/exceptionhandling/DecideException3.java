/**
 * 
 */
package exceptionhandling;

/**
 * @author Chakradhar
 *
 */
public class DecideException3 {

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
			System.out.println(e.getMessage());
		}

	}

}
