package MultiThreading;
class Q{
	boolean valset=false;
	int n;
	synchronized void put(int i){
		try{
			if(valset){
				wait();
			}
		}catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Problem in thread execution");
			}
		n=i;
		System.out.println("Put="+n);
		valset=true;
		notify();
		}
	synchronized int get(){
		try{
			if(!valset){
				wait();
			}
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Problem in thread execution");
		}
		System.out.println("Got"+n);
		valset=false;
		notify();
		return n;
	}
	}
class Producer implements Runnable{
	Q q;
	Producer(Q q){
		this.q=q;
		Thread pt=new Thread(this);
		pt.start();
	}
	public void run(){
		int i=0;
		while(true){
			q.put(++i);
		}
	}
}
class Consumer implements Runnable{
	Q q;
	public Consumer(Q q) {
		// TODO Auto-generated constructor stub
		this.q=q;
		Thread t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			int x=q.get();
		}
		
	}
}
public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q=new Q();
		Producer po=new Producer(q);
		Consumer co=new Consumer(q);

	}
}
