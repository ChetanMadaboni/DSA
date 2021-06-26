import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private int eid;
	private String ename;
	transient private Department dept;
	public Employee() {
		
	}
	public Employee(int eid, String ename, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	private void writeObject(ObjectOutputStream ous) throws IOException,
	   ClassNotFoundException {
	  try {
	   ous.defaultWriteObject();
	   ous.writeObject(dept.getId());
	   ous.writeObject(dept.getName());
	   ous.writeObject(dept.getLoc().getLocid());
	   ous.writeObject(dept.getLoc().getName());

	  } catch (Exception e) {

	   e.printStackTrace();
	  }
	 }

	 private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException {
	  try {
	   ois.defaultReadObject();
	   dept = new Department((int) ois.readObject(),(String) ois.readObject(),new Location((int) ois.readObject(),(String) ois.readObject()));
	  } 
	  catch (Exception e) {

	   e.printStackTrace();
	  } 
	 }
	 
	 
}
