package java_8_features.thread;

public class ThreadTest extends Thread {

//Thread : Thread is independent path of execution with in a same program.
	
	@Override
	public void run() {
		System.out.println("ThreadTest.run() ::: Run Method() ::: "+Thread.currentThread());
		m1();
	}
	
	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		t1.start();
		t2.start();
		
		//thread is not re-usable
		//t1.start(); //java.lang.IllegalThreadStateException
	}
	
	public void m1() {
		System.out.println("ThreadTest.m1()  ::: "+Thread.currentThread());
	}
}
