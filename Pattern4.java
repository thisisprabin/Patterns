/*
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
*/

public class Pattern4 extends Thread {
	public void run(){
		try {
			for(int i=65; i<=69; i++){
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
		Pattern4 obj = new Pattern4();
		Thread th = new Thread(obj);
		th.start();
	}
}
