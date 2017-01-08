public class Pattern16 extends Thread {	
	public void run(){
		try {
			
			for(int i=1; i<=5; i++){
				for(int j=5; j>=i; j--){
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
		Pattern16 obj = new Pattern16();
		Thread th = new Thread(obj);
		th.start();
	}
}
