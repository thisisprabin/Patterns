/*
	          A 
	        B B 
	      C C C 
	    D D D D 
	  E E E E E 
*/

public class Pattern27 extends Thread {

	public void run(){
		try {
			int alpha = 65;
			for(int i=5; i>=1; i--){
				int k = i;
				while(k>0){
					System.out.print("  ");
					k--;
				}
				int j = i - k;
				while(j<=5){
					System.out.print((char)(alpha)+" ");
					j++;
				}
				alpha++;
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Pattern27 obj = new Pattern27();
		Thread th = new Thread(obj);
		th.start();
	}
}
