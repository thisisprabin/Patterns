/*
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
*/

public class Pattern1 extends Thread {
	public void run(){
		try {
			for(int i=0; i<5; i++){
				for(int j=0; j<5; j++){
					System.out.print(" * ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...strings){
		Pattern1 obj = new Pattern1();
		Thread th = new Thread(obj);
		th.start();
	}
}
