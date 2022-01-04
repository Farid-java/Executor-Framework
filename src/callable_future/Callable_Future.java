package callable_future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Callable_Future {
	
	public static void main(String[] args) {
		
		var executor=Executors.newFixedThreadPool(2);
		
		try {
			var future=executor.submit(()->{
				 LongTask.simulate();
				return 1;
			}
			);
			
			System.out.println("Do more Work");
			try {
				var result = future.get();
				System.out.println(result);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
		} finally {
			// TODO: handle finally clause
			executor.shutdown();
		}
	}

}
