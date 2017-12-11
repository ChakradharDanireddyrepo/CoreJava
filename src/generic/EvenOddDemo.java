/**
 * 
 */
package generic;

/**
 * @author Chakradhar
 *
 */
class EvenOdd{
	int n;
	void set(int n){
		this.n=n;
	}
	String decide(){
		if(n%2==0){
			return "EVEN";
		}
		else{
			return "ODD";
		}
	}
}
public class EvenOddDemo {

	/**
	 * @param args
	 */
	public static void main(String[] k) {
		// TODO Auto-generated method stub
		if(k.length!=1){
			System.out.println("enter atleast one number");
		}
		else{
			int x=Integer.parseInt(k[0]);
			if(x<=0){
				System.out.println("Please enter valid positive value");
			}
			else{
				EvenOdd eo=new EvenOdd();
				eo.set(x);
				System.out.println(eo.decide());
			}
		}

	}

}
