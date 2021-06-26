import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Department {
	private int id;
	private String name;
	private Location Loc;
	public Location getLoc() {
		return Loc;
	}
	public void setLoc(Location loc) {
		Loc = loc;
	}
	public Department() {
		
	}
	public Department(int id, String name,Location loc) {
		super();
		this.id = id;
		this.name = name;
		Loc=loc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
//	private void writeObject(ObjectOutputStream ous) throws IOException,
//	   ClassNotFoundException {
//	  try {
//	   ous.defaultWriteObject();
//	   ous.writeObject(Loc.getLocid());
//	   ous.writeObject(Loc.getName());
//
//	  } catch (Exception e) {
//
//	   e.printStackTrace();
//	  }
//	 }
//
//	 private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException {
//	  try {
//	   ois.defaultReadObject();
//	   Loc = new Location((int) ois.readObject(),(String) ois.readObject());
//	  } 
//	  catch (Exception e) {
//
//	   e.printStackTrace();
//	  } 
//	 }
}
