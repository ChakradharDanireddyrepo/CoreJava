package MultiThreading;

import java.util.Scanner;

class Addition extends Thread{
	int a,b,res;
	void set(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void run(){
		res=a+b;
		System.out.println("Sum of numbers="+res);
		
	}
}
class Substraction implements Runnable{
	int a,b,res;
	void set(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		res=a-b;
		System.out.println("Substacted value="+res);
	}
}


public class AdditionandSubstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int a=s.nextInt();
		System.out.println("Enter Second value");
		int b=s.nextInt();
		Addition ad=new Addition();
		Substraction sb=new Substraction();
		ad.set(a,b);
		sb.set(a,b);
		ad.start();
		Thread t=new Thread(sb);
		t.start();
		try {
			ad.join();
			t.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Problem in thread execution");
		}

	}

}
