/**
 * 
 */
package exceptionhandling;

/**
 * @author Chakradhar
 *
 */
public class Division {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String a=args[0];
		String b=args[1];
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		int div=x/y;
		System.out.println("Value of Division="+div);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			// TODO: handle exception
			System.out.println("Please enter two values");
		}
		catch (NumberFormatException ne) {
			// TODO: handle exception
			System.out.println("Please enter only numeric value");
		}
		catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("Dont enter zero for denominator ");
		}

	}

}
