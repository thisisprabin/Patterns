/*
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
*/
public class Pattern17 extends Thread {
	public void run(){
		try{
			for(int i=5; i>=1; i--){
				for(int j=1; j<=i; j++){
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
		Pattern17 obj = new Pattern17();
		Thread th = new Thread(obj);
		th.start();
	}
}
