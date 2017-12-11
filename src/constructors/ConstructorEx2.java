/**
 * 
 */
package constructors;

/**
 * @author Chakradhar
 *Intialising data members in constructor
 */
public class ConstructorEx2 {

	/**
	 * @param args
	 */
	int n;
	ConstructorEx2(){
		n=10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx2 ce2=new ConstructorEx2();
		System.out.println(ce2.n);

	}

}
