/*
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 
*/

public class Pattern2 extends Thread {	
	public void run(){
		try {
			for(int i=1; i<=5; i++){
				for(int j=0; j<5; j++){
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...strings){
		Pattern2 obj = new Pattern2();
		Thread th = new Thread(obj);
		th.start();
	}
}
