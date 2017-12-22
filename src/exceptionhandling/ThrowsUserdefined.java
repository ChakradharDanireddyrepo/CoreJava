/**
 * 
 */
package exceptionhandling;

import java.util.Scanner;

/**
 * @author Chakradhar
 *
 */
public class ThrowsUserdefined {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numerator");
		String s1=s.nextLine();
		System.out.println("Enter denominator");
		String s2=s.nextLine();
		ThrowsUserdefined1 tu=new ThrowsUserdefined1();
		try{
		tu.division(s1,s2);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Please enter valid value");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Dont enter zero for denominator");
		}

	}

}
