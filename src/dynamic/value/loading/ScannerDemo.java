/**
 * 
 */
package dynamic.value.loading;

import java.util.Scanner;

/**
 * @author Chakradhar
 *
 */
public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter once value");
		int x=s.nextInt();
		System.out.println("Value entered is="+x);
		s.close();

	}

}
