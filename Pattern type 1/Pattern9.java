/*
E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A 
*/

public class Pattern9 extends Thread {
	public void run(){
		try {
			for(int i=0; i<5; i++){
				for(int j=69; j>=65; j--){
					System.out.print((char)j+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...strings){
		Pattern9 obj = new Pattern9();
		Thread th = new Thread(obj);
		th.start();
	}
}
