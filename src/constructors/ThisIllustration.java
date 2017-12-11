/**
 * 
 */
package constructors;

/**
 * @author Chakradhar
 *
 */
class Test{
	int a,b;
	Test(int a,int b){
		this.a=a+10;
		this.b=b+20;
		a=a+1;
		b=b+2;
		System.out.println("Formal parameter a="+a);
		System.out.println("Formal parameter b="+b);
		System.out.println("Data Member a="+this.a);
		System.out.println("Data Member a="+this.b);
	}
}
public class ThisIllustration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test(10,20);

	}

}
