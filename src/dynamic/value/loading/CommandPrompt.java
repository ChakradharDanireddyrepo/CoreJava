/**
 * 
 */
package dynamic.value.loading;

/**
 * @author Chakradhar
 *using length implict variable provided JVM finds length of array 
 */
public class CommandPrompt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("enter atleast one value");
		}
		else{
			int x=Integer.parseInt(args[0]);
			System.out.println("Command Line argument is="+x);
		}

	}

}
