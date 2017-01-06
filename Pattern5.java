/*
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 
*/

public class Pattern5 extends Thread {
	public void run(){
		try {
			for(int i=0; i<5; i++){
				for(int j=65; j<=69; j++){
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
		Pattern5 obj = new Pattern5();
		Thread th = new Thread(obj);
		th.start();
	}
}
