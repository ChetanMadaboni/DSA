import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String []args) {
		List<Student> st=new ArrayList<Student>();
		st.add(new Student(1,40,"Hari"));
		st.add(new Student(2,70,"chetan"));
		st.add(new Student(3,60,"ram"));
		st.add(new Student(4,90,"sati"));
		st.add(new Student(5,120,"sati"));
		Predicate<Student> isName=e->e.getName()=="sati";
		Predicate<Student> isMarks=e->e.getMarks()>100;
		st.stream().filter(isMarks.and(isName)).map(s->s.getMarks()).forEach(System.out::println);
		//System.out.println(arr.toString());
	}
}
