import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner; 

public class Login {
	
	public void RegisterStudents(){
	
		System.out.println("\nUNIVERSITY OF GUGSI");
		System.out.println(" REGISTER STUDENTS\n");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Student Name : ");//Enter Student Name
		String Name = sc.next();		
		
		System.out.print("Enter Student ID   : ");//Enter Student ID
		String ID = sc.next();
		
		Award award=new Award();//getting user details to award class
		award.setName(Name);
		award.setID(ID);
		
		Level4 level4=new Level4();//go to the Level4
		level4.Level4Marks();
	}
}
