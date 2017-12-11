/**
 * 
 */
package dynamic.value.loading;

import java.util.Scanner;

/**
 * @author Chakradhar
 *
 */
class Mul{
	int a,b;
	Mul(){
		a=b=0;
	}
	Mul(int a,int b){
		this.a=a;
		this.b=b;
	}
	void Multiply(Mul x,Mul y){
		this.a=x.a*y.a;
		this.b=x.b*y.b;
	}
	void disp(){
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
	}
}
public class ScannerParameterisedCosntructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter first value for object 1");
		int x1=Integer.parseInt(s.nextLine());
		System.out.println("Enter second value for object 1");
		int x2=Integer.parseInt(s.nextLine());
		Mul m1=new Mul(x1,x2);
		System.out.println("Enter first value for object 2");
		int x3=Integer.parseInt(s.nextLine());
		System.out.println("Enter second value for object 2");
		int x4=Integer.parseInt(s.nextLine());
		Mul m2=new Mul(x3,x4);
		Mul m3=new Mul();
		m3.Multiply(m1,m2);
		System.out.println("Values of m1");
		m1.disp();
		System.out.println("values of m2");
		m2.disp();
		System.out.println("values of m3");
		m3.disp();

	}

}
