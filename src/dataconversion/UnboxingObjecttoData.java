package dataconversion;

public class UnboxingObjecttoData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer io=new Integer(10);
		int i=io.valueOf(io);
		System.out.println("Value of data="+10);
		int i1=20;
		Integer io1=i1;//Auto Boxing

	}

}
