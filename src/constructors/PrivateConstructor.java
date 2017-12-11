/**
 * 
 */
package constructors;

/**
 * @author Chakradhar
 *Class Demo has private constructor whose object cannot be created in PrivateConstructor
 */
class Demo{
	private Demo(){
		System.out.println("Private constructor");
	}
	Demo(int n){
		System.out.println("Parameterised constructor value input="+n);
	}
}
public class PrivateConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo(20);

	}

}
