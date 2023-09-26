package student;
import java.util.*;
public class Batch {
	
	static Student_details java[]=new Student_details[10];
	static Student_details aws[]=new Student_details[10];
	Scanner sc=new Scanner(System.in);
	static int index=0;
	
	public void Create_details() {
		
		String std_Name;
		String course_Name;
		String email_id;
		int id;
		int phone_No;
		
		System.out.println("enter the Name: ");
		std_Name=sc.next();
		System.out.println("enter the course:  ");
		course_Name=sc.next();
		System.out.println("enter the email: ");
		email_id=sc.next();
		System.out.println("enter the id: ");
		id=sc.nextInt();
		System.out.println("enter the ph_no: ");
		phone_No=sc.nextInt();
		if(course_Name.equalsIgnoreCase("java")) {
			java[index]=new Student_details(std_Name, course_Name, email_id, id, phone_No);
			index++;
			System.out.println("done");
		}
		else if(course_Name.equalsIgnoreCase("aws")) {
			aws[index]=new Student_details(std_Name, course_Name, email_id, id, phone_No);
			index++;
			System.out.println("done");
		}
		else {
			System.out.println("invalid course");
		}
		
	}
	public void getdetails() {
		System.out.println("enter the course:  ");
		String course_Name=sc.next();
		if(course_Name.equalsIgnoreCase("java")) {
			for(int i=0;i<index;i++) {
				
				System.out.println("Name: "+java[i].getName());
				System.out.println("course_name: "+java[i].getCourse_Name());
				System.out.println("email: "+java[i].getEmail_id());
				System.out.println("id: "+java[i].getId());
				System.out.println("phone: "+java[i].getPhone_No());
				
			}
		}
		else if(course_Name.equalsIgnoreCase("aws")) {
			for(int i=0;i<index;i++) {
				
				System.out.println("Name: "+aws[i].getName());
				System.out.println("course_name: "+aws[i].getCourse_Name());
				System.out.println("email: "+aws[i].getEmail_id());
				System.out.println("id: "+aws[i].getId());
				System.out.println("phone: "+aws[i].getPhone_No());
				
			}
		}
	}
}
