

public class Student implements Comparable<Student>{
	private int id,marks;
	String name;
	
	public Student(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		if(this.marks<o.marks) {return -1;}
		if(this.marks>o.marks) {return 1;}
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	
}
