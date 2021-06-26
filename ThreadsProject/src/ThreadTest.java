class ThreadCustom extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("run"+Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		ThreadCustom t1=new ThreadCustom();
		
		ThreadCustom t2=new ThreadCustom();
		t2.setName("2");
		t1.start();
		t2.start();
		System.out.println("Main");

	}

}
