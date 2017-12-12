/**
 * 
 */
package Inheritance;

/**
 * @author Chakradhar
 *
 */
public class SuperParameterisedConstructorLevel2 extends SuperParameterisedConstructorLevel1 {
	
	int a;
	SuperParameterisedConstructorLevel2(int a){
		super(10);
		System.out.println("Parameterised constructor of SuperParameterisedConstructorLevel2");
		this.a=a;
		System.out.println("Value of a from SuperParameterisedConstructorLevel2="+this.a);
	}

}
