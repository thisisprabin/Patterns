/*
	5 5 5 5 5 
	4 4 4 4 
	3 3 3 
	2 2 
	1 
*/

public class Pattern20 extends Thread {
	
	public void run(){
		try {
			for(int i=5; i>=1; i--){
				for(int j=1; j<=i; j++){
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
			
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Pattern20 obj = new Pattern20();
		Thread th = new Thread(obj);
		th.start();
	}

}
