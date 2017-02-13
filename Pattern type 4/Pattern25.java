/*
	        1 
	      2 2 
	    3 3 3 
	  4 4 4 4 
	5 5 5 5 5
*/

public class Pattern25 extends Thread {
	
	public void run(){
		try{
			int num = 1;
			for(int i=5; i>=1; i--){
				int k = i - 1;
				while(k>0){
					System.out.print("  ");
					k--;
				}
				int j = i - k;
				while(j<=5){
					System.out.print(num+" ");
					Thread.sleep(1000);
					j++;
				}
				num++;
				System.out.println();
			}
			
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Pattern25 obj = new Pattern25();
		Thread th = new Thread(obj);
		th.start();
	}
}
