package basicjava;

public class Stud {
	private int id;
	private String name,emailid,course;
	private long phone;
	private char division;
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	public Stud(int id, String name, String emailid, String course, long phone, char division) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.course = course;
		this.phone = phone;
		this.division = division;
	}
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", emailid=" + emailid + ", course=" + course + ", phone=" + phone
				+ ", division=" + division + "]";
	}
	
}
