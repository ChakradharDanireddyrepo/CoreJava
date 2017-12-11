/**
 * 
 */
package dynamic.value.loading;

/**
 * @author Chakradhar
 *
 */
class Multiply{
	int a,b;
	void set(int a,int b){
		this.a=a;
		this.b=b;
	}
	int square(){
		return a*b;
	}
}

public class MultiplyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply m=new Multiply();
		m.set(10,20);
		System.out.println("Multiplication of number="+m.square());

	}

}
