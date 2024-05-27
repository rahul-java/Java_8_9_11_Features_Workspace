package java_8_features.thread.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		//ex.submit(null)
	}
}
