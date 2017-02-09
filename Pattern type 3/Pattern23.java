/*
	E D C B A 
	E D C B 
	E D C 
	E D 
	E 
*/

public class Pattern23 extends Thread {

	public void run(){
		try{
			for(int i=5; i>=1; i--){
				for(int j=1; j<=i; j++){
					System.out.print((char)(70-j)+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Pattern23 obj = new Pattern23();
		Thread th = new Thread(obj);
		th.start();
	}
}
