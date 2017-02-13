/*
	          A 
	        A B 
	      A B C 
	    A B C D 
	  A B C D E 
*/

public class Pattern28 extends Thread {
	
	public void run(){
		try {
			for(int i=5; i>=1; i--){
				int k = i;
				while(k>0){
					System.out.print("  ");
					k--;
				}
				int j = i - k;
				int alpha = 65;
				while(j<=5){
					System.out.print((char) alpha+" ");
					Thread.sleep(1000);
					alpha++;
					j++;
				}
				System.out.println();
			}
			
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Pattern28 obj = new Pattern28();
		Thread th = new Thread(obj);
		th.start();
	}
}
