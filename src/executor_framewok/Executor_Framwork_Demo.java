package executor_framewok;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Framwork_Demo {
	
	//Executor framework introduced in 1.5 java
	
	public static void main(String[] args) {
		
		//below 3 thread in pool which can ready for task
var executor = Executors.newFixedThreadPool(3);

for (int i=1;i<20;i++) {
executor.submit(()->
  {
	  System.out.println(Thread.currentThread().getName());
  }
  );
	}

     executor.shutdown();

}
}
