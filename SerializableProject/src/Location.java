
public class Location {
	private int locid;
	private String name;
	
	public Location() {
		
	}
	public Location(int locid, String name) {
		super();
		this.locid = locid;
		this.name = name;
	}
	public int getLocid() {
		return locid;
	}
	public void setLocid(int locid) {
		this.locid = locid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Location [locid=" + locid + ", name=" + name + "]";
	}
//	public Object getLocid() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
