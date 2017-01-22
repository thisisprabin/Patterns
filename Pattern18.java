/*

	A A A A A 
	B B B B 
	C C C 
	D D 
	E 

*/
public class Pattern18 extends Thread{
	
	public void run(){
		try{
			for(int i=5; i>=1; i--){
				for(int j=1; j<=i; j++){
					System.out.print((char)(70 - i)+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
			
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Pattern18 obj = new Pattern18();
		Thread th = new Thread(obj);
		th.start();
	}
}
