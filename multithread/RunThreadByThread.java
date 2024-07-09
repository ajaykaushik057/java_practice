package multithread;

class MyThread extends Thread {
	MyThread(String name){
		super(name);
	}
	public void run () {
		for(int i=0;i<5;i++)
		{
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}


public class RunThreadByThread {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    MyThread t1=new MyThread("Thread 1");
    t1.start();
    MyThread t2=new MyThread("Thread 2");
    t2.start();
    MyThread t3=new MyThread("Thread 3");
    t3.start();
  }
    
}