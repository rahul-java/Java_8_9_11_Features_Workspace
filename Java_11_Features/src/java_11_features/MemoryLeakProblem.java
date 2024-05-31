package java_11_features;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class MemoryLeakProblem {
	
	//no limit
	private static BlockingQueue<byte[]> queue=new LinkedBlockingQueue<>();
	
	public static void main(String[] args) {
		
		Runnable producer=()->{
			while(true)
			{
				//generate 1mb of object 10ms
				queue.offer(new byte[1*1024*1024]);
				
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable consumer=()->{
			while(true)
			{
				try {
					//process every 100ms
					queue.take();
					TimeUnit.MICROSECONDS.sleep(100);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		};
		
		new Thread(producer,"Producer Thread").start();
		new Thread(consumer,"Consumer Thread").start();
	}

}

/*
 * Exception in thread "Producer Thread" java.lang.OutOfMemoryError: Java heap space
	at com.mkyong.java11.jep328.OOME.lambda$main$0(OOME.java:14)
	at com.mkyong.java11.jep328.OOME$$Lambda$14/0x0000000800066840.run(Unknown Source)
	at java.base/java.lang.Thread.run(Thread.java:834)
 *
 * 
 * $ javac MemoryLeakProblem.java

$ java -XX:StartFlightRecording=duration=30s,settings=profile,filename=leak.jfr MemoryLeakProblem
 * */
 