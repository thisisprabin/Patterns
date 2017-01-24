/*
E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A 
*/

public class Pattern8 extends Thread {
	public void run(){
		try {
			for(int i=69; i>=65; i--){
				for(int j=0; j<5; j++){
					System.out.print((char)i+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...strings){
		Pattern8 obj = new Pattern8();
		Thread th = new Thread(obj);
		th.start();
	}
}
