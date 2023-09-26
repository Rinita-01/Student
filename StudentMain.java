package student;
import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		
				int ch;
				Batch Student=new Batch();
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Welcome to our Intership Program");
				do {
					System.out.println("\n1.Create details\n2.Get details\n3.exit");
					ch=sc.nextInt();
					switch (ch) {
					case 1: 
						Student.Create_details();
						break;
					case 2:
						Student.getdetails();
						break;
					case 3:
						System.exit(0);
					default:
						System.out.println("Choose correct Option");
					}
				}while(true);

			}

		}
