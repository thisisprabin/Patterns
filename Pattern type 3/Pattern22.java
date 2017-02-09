/*
	E E E E E 
	D D D D 
	C C C 
	B B 
	A 
*/

public class Pattern22 extends Thread {

	public void run(){
		try {
			for(int i=5; i>=1; i--){
				for(int j=1; j<=i; j++){
					System.out.print((char)(64+i)+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Pattern22 obj = new Pattern22();
		Thread th = new Thread(obj);
		th.start();
	}
}
