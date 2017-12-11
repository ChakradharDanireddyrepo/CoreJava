/**
 * 
 */
package constructors;

/**
 * @author Chakradhar
 *
 */
class Test1{
	int a,b;
	Test1(){
		a=b=0;
	}
	Test1(int a,int b){
		this.a=a;
		this.b=b;
	}
	Test1 sum(Test1 t){
		Test1 t11=new Test1();
		t11.a=this.a+t.a;
		t11.b=this.b+t.b;
		return t11;
	}
	void disp(){
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}
}
public class ConstructandThis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1(10,20);
		Test1 t2=new Test1(30,40);
		Test1 t3=new Test1();
		t3=t1.sum(t2);
		t1.disp();
		t2.disp();
		t3.disp();

	}

}
