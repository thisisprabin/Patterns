/*
	A B C D E 
	A B C D 
	A B C 
	A B 
	A 
*/

public class Pattern19 extends Thread {

	public void run(){
		try{
			for(int i=5; i>=1; i--){
				for(int j=1; j<=i; j++){
					System.out.print((char)(64+j)+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Pattern19 obj = new Pattern19();
		Thread th = new Thread(obj);
		th.start();
	}
}
