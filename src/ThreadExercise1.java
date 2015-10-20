import java.util.Scanner;

class Work implements Runnable{
	public int seqNo=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName());
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
		seqNo=sc.nextInt();
	for (int i = 0; i < 10; i++) {
			//	Thread.sleep(100);
			System.out.println(i);
			
		}
	
	}
	Work(int seqNo){
		this.seqNo=seqNo;
	}
}
public class ThreadExercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Work target=new Work(0);
		new Thread(target).start();
		//int i=0;
		while(true){
			Thread.sleep(1000);
			System.out.println(target.seqNo++);
		}
		
		/*new Work().run();
		for(int i=0;i<10;i++){
		//	Thread.sleep(100);
			System.out.println(i);
		}
*/
	}

}
