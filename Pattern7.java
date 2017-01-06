/*
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
*/

public class Pattern7 extends Thread {
	public void run(){
		try {
			for(int i=5; i>=1; i--){
				for(int j=5; j>=1; j--){
					System.out.print(j+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
		
	public static void main(String...strings){
		Pattern7 obj = new Pattern7();
		Thread th = new Thread(obj);
		th.start();
	}
}
