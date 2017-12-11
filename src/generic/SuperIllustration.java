/**
 * 
 */
package generic;

import java.util.Scanner;

/**
 * @author Chakradhar
 *
 */
public class SuperIllustration extends SuperIlustration1{

	/**
	 * @param args
	 */
	static int a;
	int set(int a){
		super.a=a;
		return super.a;
	}
	void disp(){
		System.out.println("Display method of base class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value for current class varialble");
		a=s.nextInt();
		SuperIllustration si=new SuperIllustration();
		System.out.println("Base class a="+a);
		System.out.println("Super class a="+si.set(20));
		

	}

}
