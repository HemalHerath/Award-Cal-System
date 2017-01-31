import java.util.Scanner;

public class MainLogin {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("UNIVERSITY OF GUGSI");
		System.out.println("      LOGIN\n      ");
		
		String name="";
		int password=0;
		
		while(!(name.equals("hemal")) || password!=118){//check user name and password
			System.out.print("Enter User Name : ");
			name=sc.next();
			System.out.print("Enter password  : ");
			password=sc.nextInt();
			
			if(!(name.equals("hemal")) || password!=118){//if user name and password correct
				System.err.println("LOGIN FAIL");
			}else{
				System.out.println("LOGIN SUCCESS");//if user name and password wrong
			}
		}			
		
		Login mainLogin = new Login();//if login success go to the next page
		mainLogin.RegisterStudents();
		
	}
}
