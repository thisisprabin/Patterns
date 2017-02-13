/*
		     *
	       * *
	     * * *
	   * * * *
	 * * * * *
*/

public class Pattern24 extends Thread {
	
	public void run(){
		try{
			int k = 0;
			for(int i=5; i>=1; i--){
				k = i - 1;
				while(k>0){
					System.out.print("  ");
					k--;
				}
				int j = i - k;
				while(j<=5){
					Thread.sleep(1000);
					System.out.print(" *");
					j++;
				}
				
				System.out.println();
			}
			
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String...strings){
		Pattern24 obj = new Pattern24();
		Thread th = new Thread(obj);
		th.start();
	}
}
