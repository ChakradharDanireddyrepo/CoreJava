package polymorphism;

public class ABDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations o=new Isum();
		o.sum();
		o=new Fsum();
		o.sum();
		Fsum fs=new Fsum();
		fs.disp();//We cant access diplay method using operations class object even if it contains reference of Fsum
		

	}

}
