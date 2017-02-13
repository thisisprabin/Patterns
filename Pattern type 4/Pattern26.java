/*
          1 
        1 2 
      1 2 3 
    1 2 3 4 
  1 2 3 4 5 
*/

public class Pattern26 extends Thread {
	
	public void run(){
		try {
			for(int i=5; i>=1; i--){
				int k = i;
				while(k>0){
					System.out.print("  ");
					k--;
				}
				int j = i - k;
				int num = 1;
				while(j<=5){
					System.out.print(num+" ");
					Thread.sleep(1000);
					num++;
					j++;
				}
				System.out.println();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Pattern26 obj = new Pattern26();
		Thread th = new Thread(obj);
		th.start();
	}
}
