package MultiThreading;
class Account{
	private int bal=0;
	synchronized void deposit(int amt){
		bal=bal+amt;
		System.out.println("Cuurent balance"+bal);
	}
	int balance(){
		return bal;
	}
}
class Customer extends Thread{
	Account ac;
	Customer(Account ac){
		this.ac=ac;
	}
	public void run(){
		ac.deposit(10);
	}
}
public class SynchronisationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		Customer c[]=new Customer[5];
		for (int i = 0; i < 5; i++) {
			c[i]=new Customer(a);
			
		}
		for (int i = 0; i < 5; i++) {
			c[i].start();
			
		}
		try{
		for (int i = 0; i < 5; i++) {
			c[i].join();
			
		}
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Problem while executing thread");
		}
		System.out.println("Total bal="+a.balance());

	}

}
