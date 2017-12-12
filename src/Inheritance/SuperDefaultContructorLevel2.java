/**
 * 
 */
package Inheritance;

/**
 * @author Chakradhar
 *
 */
public class SuperDefaultContructorLevel2 extends SuperDefaultContructorLevel1 {
	int b;
	public SuperDefaultContructorLevel2() {
		// TODO Auto-generated constructor stub
		//super();//Optional because each base class contains only one form of default contructor
		b=20;
		System.out.println("Value of b from SuperDefaultContructorLevel2="+b);
	}

}
