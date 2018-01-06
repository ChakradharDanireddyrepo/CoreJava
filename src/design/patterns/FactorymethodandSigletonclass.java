package design.patterns;

class Factory{
	private static Factory f=null;
	private Factory(){
		System.out.println("Object is created for first time");
	}
	public static Factory create(){
		if(f==null){
			f=new Factory();
		}
		else{
			System.out.println("Object is already created");
		}
		return f;
	}
	
}

public class FactorymethodandSigletonclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factory f1=new Factory();//Single constructor is private
		Factory f2=Factory.create();
		Factory f3=Factory.create();
		Factory f4=Factory.create();
		if((f2==f3) && (f2==f4)){
			System.out.println("Mutiple object same reference");
		}
		else{
			System.out.println("Multiple objects with different reference");
		}

	}

}
