package Interfaces;

public class ClassInterfaceDemonstration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 i1=new ClassInterfaceDemonstration();
		i1.method1();
		//i1.method2();//Invalid
		Interface2 i2=new ClassInterfaceDemonstration();
		i2.method2();
		ClassInterfaceDemonstration ci=new ClassInterfaceDemonstration();
		ci.method1();
		ci.method2();
		ci.method3();
		

	}

}
