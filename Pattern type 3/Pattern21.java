/*
	5 4 3 2 1 
	5 4 3 2 
	5 4 3 
	5 4 
	5 
*/

public class Pattern21 extends Thread {
	
	public void run(){
		try {
			
			for(int i=5; i>=1; i--){
				for(int j=1; j<=i; j++){
					System.out.print(6 - j+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...strings){
		Pattern21 obj = new Pattern21();
		Thread th = new Thread(obj);
		th.start();
	}
}
