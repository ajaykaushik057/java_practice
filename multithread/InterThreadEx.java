package multithread;

class Shared {
	int itemCount=0;
	boolean check=false;
	synchronized void get() {
		if(check==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("GET="+itemCount);
		check=false;
		notify();
	}
	synchronized void put(int itemCount) {
		if(check==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.itemCount=itemCount;
		System.out.println("PUT="+this.itemCount);
		check=true;
		notify();
	}
}
class Consumer extends Thread {
	Shared s;
	Consumer(Shared s){
		this.s=s;
		start();
	}
	public void run() {
		for(int i=1;i<=5;i++)
		{
		s.get();
		}
	}
}
class Producer extends Thread {
	Shared s;
	Producer(Shared s){
		this.s=s;
		start();
	}
	public void run() {
		for(int i=1;i<=5;i++)
		{
		s.put(i);
		}
	}
	}
public class InterThreadEx {

	public static void main(String[] args) {
		Shared s=new Shared();
          new Producer(s);
          new Consumer(s);
	}

}
