/**
 * 
 */
package Inheritance;

/**
 * @author Chakradhar
 *
 */
public class SuperParameterisedConstructorLevel1 {
	
	int a;
	SuperParameterisedConstructorLevel1(int a){
		System.out.println("Parameterised constructor of SuperParameterisedConstructorLevel1");
		this.a=a;
		System.out.println("Value of a from SuperParameterisedConstructorLevel1="+this.a);
	}

}
