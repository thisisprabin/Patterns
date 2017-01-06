/*
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
*/

public class Pattern3 extends Thread {
	public void run(){
		try{
			for(int i=0; i<5; i++){
				int j = 1;
				while(j<=5){
					System.out.print(j+" ");
					j++;
					Thread.sleep(1000);
				}
				System.out.println();
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...strings){
		Pattern3 obj = new Pattern3();
		Thread th = new Thread(obj);
		th.start();
	}
}
