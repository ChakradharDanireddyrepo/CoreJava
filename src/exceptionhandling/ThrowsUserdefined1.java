package exceptionhandling;

public class ThrowsUserdefined1{
	public void division(String a,String b) throws ArithmeticException,NumberFormatException{
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		int z=x/y;
		System.out.println("Value of Division="+z);
	}

}
