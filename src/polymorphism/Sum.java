/**
 * 
 */
package polymorphism;

/**
 * @author Chakradhar
 *Methos sum is polymorphic method
 *obect 's' polymorphic object
 *s.sum(); is polymorphic statement
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum1 s=new Sum1();
		s.sum();
		s=new Sum2();
		s.sum();
		s=new Sum3();
		s.sum();

	}

}
