/**
 * 
 */
package staticandinstance;

/**
 * @author Chakradhar
 *
 */
public class StaticInstanceDatamembers {

	/**
	 * @param args
	 */
	static int a=10;
	int b=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static value="+a);
		StaticInstanceDatamembers sid=new StaticInstanceDatamembers();
		System.out.println("Instance data member="+sid.b);

	}

}
