
public class SampleThread implements Runnable{
	
	public void run() {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Thread Count: " + i);
			
			try {
				Thread.sleep(1000); //thread try and catch kula tha varanum
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
