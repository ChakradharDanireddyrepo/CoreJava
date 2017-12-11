/**
 * 
 */
package Inheritance;

/**
 * @author Chakradhar
 *
 */
class BaseClass1{
	void dispBase(){
		System.out.println("Display method of base class");
	}
}
class DerivedClass1 extends BaseClass1{
	void dispDerived(){
		System.out.println("Display method of Derived class");
	}
}
public class InheritanceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass1 dc1=new DerivedClass1();
		dc1.dispBase();
		dc1.dispDerived();
		BaseClass1 bc1=new BaseClass1();
		bc1.dispBase();
		//bc1.dispDerived(); cannot call

	}

}
