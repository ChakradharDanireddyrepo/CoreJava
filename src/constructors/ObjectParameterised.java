/**
 * 
 */
package constructors;

/**
 * @author Chakradhar
 *
 */
public class ObjectParameterised {

	/**
	 * @param args
	 */
	int a;
	int b;
	ObjectParameterised(ObjectParameterised O){
		this.a=O.a;
		this.b=O.b;	
		System.out.println("Addition both values="+(a+b));
	}
	ObjectParameterised(int a,int b){
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectParameterised op=new ObjectParameterised(10,20);
		ObjectParameterised op1=new ObjectParameterised(op);

	}

}
