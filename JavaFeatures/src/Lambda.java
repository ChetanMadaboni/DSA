import java.util.ArrayList;
import java.util.List;

interface test{
	public void print(String name);
}
public class Lambda {

	public static void main(String[] args) {
		
//		test t1=new test() {
//			public void print(String name) {
//				System.out.println("Hie "+name);
//			}
//		};
		test t1=(name)->{
			System.out.println("Hie8"+name);
		};
		t1.print("chetan");
	

//	@Override
//	public void print(String name) {
//		System.out.println("main");
//		
//	}
	List<Integer> li=new ArrayList<Integer>();
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(5);
	li.add(6);
	li.forEach((n)->System.out.println(n));
	}

}
