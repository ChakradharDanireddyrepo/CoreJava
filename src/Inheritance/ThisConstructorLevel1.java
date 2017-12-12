/**
 * 
 */
package Inheritance;

/**
 * @author Chakradhar
 *
 */
public class ThisConstructorLevel1 {
	int a;
	ThisConstructorLevel1(){
		this(20);
		System.out.println("Default Constructor of ThisConstructorLevel1");
		this.a=10;
		System.out.println("Vaue of a form default constructor="+a);
	}
	ThisConstructorLevel1(int a){
		System.out.println("Parameterised Constructor of ThisConstructorLevel1");
		this.a=a;
		System.out.println("Vaue of a form Parameterised constructor="+a);
	}

}
