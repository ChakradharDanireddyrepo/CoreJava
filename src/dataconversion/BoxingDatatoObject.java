package dataconversion;

public class BoxingDatatoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Integer io=new Integer(i);//No need from Java 1.5 as support auto boxing and unboxing
		System.out.println("Value of object="+io);
		Integer io1=new Integer(20);
		int i1=io1;//Auto Unboxing

	}

}
