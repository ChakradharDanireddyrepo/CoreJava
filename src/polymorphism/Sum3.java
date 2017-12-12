package polymorphism;

public class Sum3 extends Sum2 {
	
	Character a='a',b='b',c;
	
	void sum(){
		c=(char) (a+b);
		System.out.println("Sum of Character data="+c);
	}
	

}
