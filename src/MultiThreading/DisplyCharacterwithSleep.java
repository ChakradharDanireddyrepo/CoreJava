package MultiThreading;

import java.util.Scanner;

class Sample implements Runnable{
	int noc;
	String text;
	Sample(){
		Thread sam=new Thread(this,"Runnable");
		sam.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Name of Fore Ground Thread in Run()="+t.getName());
		Scanner s=new Scanner(System.in);
		System.out.println("Enter line of text");
		String text=s.nextLine();
		int noc=text.length();
		try{
			for (int i = 0; i < noc; i++) {
				char ch=text.charAt(i);
				System.out.println("\t\t\t"+ch);
				Thread.sleep(1000);
			}
		}
			catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Problem in thread execution");
			}


	}
}
public class DisplyCharacterwithSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s=new Sample();
		Thread t=Thread.currentThread();
		System.out.println("Name of Fore Ground Thread in main="+t.getName());

	}

}

