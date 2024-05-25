package java_9_features.java_9_changes;

import java.io.IOException;
import java.lang.ProcessHandle.Info;
import java.util.Optional;

public class ProcessAPIChanges {

	public static void main(String[] args) throws IOException {
		
		ProcessHandle pr = ProcessHandle.current();
		System.out.println(pr.pid());
		System.out.println(pr);
		
		System.out.println("===================================");
		
		Optional<ProcessHandle> optional = ProcessHandle.of(3040);
		if(optional.isPresent())
		{
			ProcessHandle pr1 = optional.get();
			System.out.println(pr1.pid());
			Info info = pr1.info();
			System.out.println("info ::: "+info);
			System.out.println("user ::: "+info.user().get());
			System.out.println("command ::: "+info.command().get());
			System.out.println("started ::: "+info.startInstant().get());
			System.out.println("total cpu time ::: "+info.totalCpuDuration().get());
			
			System.out.println(pr1);
			System.out.println(pr1.destroy()); //this will close that application/process which is notepad.
			
		}
		
		ProcessHandle.allProcesses().forEach(p->System.out.println(p.info().user()+" : "+p.pid()));
		
		//opening notepad using java code
		Process p=new ProcessBuilder("notepad.exe").start();
		
		//opening eclipe using java code
		Process p1=new ProcessBuilder("C:\\Users\\hp\\eclipse\\jee-2023-12\\eclipse\\eclipse.exe").start();
		
	}
	
}
