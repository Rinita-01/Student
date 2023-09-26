package student;

public class Student_details {
	
	String std_Name;
	String course_Name;
	String email_id;
	int id;
	int phone_No;
	
	public Student_details(String std_Name,String course_Name,String email_id,int id,int phone_No) {
		
		this.std_Name=std_Name;
		this.course_Name=course_Name;
		this.email_id=email_id;
		this.id=id;
		this.phone_No=phone_No;
	}
	public void setName(String std_Name) {
		this.std_Name=std_Name;
	}
	public String getName() {
		return std_Name;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone_No() {
		return phone_No;
	}
	public void setPhone_No(int phone_No) {
		this.phone_No = phone_No;
	}
	
}
