import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Award {
	
	public static double Level5marks;
	public static double Level6marks;
	public static double minL5;
	public static double minL6;
	public static int p;
	public static int q;
	public static String name;
	public static String ID;
	public static int TotL4;
	public static int TotalRefL4;
	public static int TotalRetL4;
	public static int TotalRef2L4;
	public static int TotalRefL5;
	public static int TotalRetL5;
	public static int TotalRef2L5;
	public static int TotalRefL6;
	public static int TotalRetL6;
	public static int TotalRef2L6;

	public static int getTotalRefL6() {
		return TotalRefL6;
	}

	public static void setTotalRefL6(int totalRefL6) {
		TotalRefL6 = totalRefL6;
	}

	public static int getTotalRetL6() {
		return TotalRetL6;
	}

	public static void setTotalRetL6(int totalRetL6) {
		TotalRetL6 = totalRetL6;
	}

	public static int getTotalRef2L6() {
		return TotalRef2L6;
	}

	public static void setTotalRef2L6(int totalRef2L6) {
		TotalRef2L6 = totalRef2L6;
	}

	public static int getTotalRefL5() {
		return TotalRefL5;
	}

	public static void setTotalRefL5(int totalRefL5) {
		TotalRefL5 = totalRefL5;
	}

	public static int getTotalRetL5() {
		return TotalRetL5;
	}

	public static void setTotalRetL5(int totalRetL5) {
		TotalRetL5 = totalRetL5;
	}

	public static int getTotalRef2L5() {
		return TotalRef2L5;
	}

	public static void setTotalRef2L5(int totalRef2L5) {
		TotalRef2L5 = totalRef2L5;
	}

	public static int getTotalRef2L4() {
		return TotalRef2L4;
	}

	public static void setTotalRef2L4(int totalRef2L4) {
		TotalRef2L4 = totalRef2L4;
	}

	public static int getTotalRetL4() {
		return TotalRetL4;
	}

	public static void setTotalRetL4(int totalRetL4) {
		TotalRetL4 = totalRetL4;
	}

	public static int getTotalRefL4() {
		return TotalRefL4;
	}

	public static void setTotalRefL4(int totalRefL4) {
		TotalRefL4 = totalRefL4;
	}

	public static int getTotL4() {
		return TotL4;
	}

	public static void setTotL4(int totL4) {
		TotL4 = totL4;
	}

	public static int getP() {
		return p;
	}

	public static void setP(int p) {
		Award.p = p;
	}

	public static int getQ() {
		return q;
	}

	public static void setQ(int q) {
		Award.q = q;
	}

	public static double getMinL6() {
		return minL6;
	}

	public static void setMinL6(double minL6) {
		Award.minL6 = minL6;
	}

	public static double getMinL5() {
		return minL5;
	}

	public static void setMinL5(double minL5) {
		Award.minL5 = minL5;
	}

	public static double getLevel6marks() {
		return Level6marks;
	}

	public static void setLevel6marks(double level6marks) {
		Level6marks = level6marks;
	}
	
	public void Result(){
		
		System.out.println("\n      <<<<<<<FINAL REPORT>>>>>>>\n");
		
		File file =new File("Final_Report.txt");
		Student st=new Student(name,ID,TotL4,Level5marks,Level6marks,TotalRefL4,TotalRetL4,TotalRef2L4,
				TotalRefL5,TotalRetL5,TotalRef2L5,TotalRefL6,TotalRetL6,TotalRef2L6);
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			oos.writeObject(st);
			//oos.writeObject(ID);
			oos.flush();
			oos.close();
			fos.close();
		}catch (IOException e) {
			System.out.println("File\"Register_Student.txt\"created");
		}
		//deserialization
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream oos =new ObjectInputStream(fis);
            System.out.println(oos.readObject()); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		Award award=new Award();
		
		award.getLevel5marks();//get level5 marks from the level5 class
		award.getLevel6marks();//get level6 marks from the level6 class
		award.getMinL5();//get level5 min mark from the level5 class
		award.getMinL6();//get level6 min mark from the level6 class
		award.getP();//get level5 pass module from the level5 class
		award.getQ();//get level6 pass module from the level6 class
		award.getName();//get user name from the login class
		award.getID();//get user ID from the login class 
		award.getTotL4();//get Level4 marks
		award.getTotalRefL4();
		award.getTotalRetL4();
		award.getTotalRef2L4();
		award.getTotalRefL5();
		award.getTotalRetL5();
		award.getTotalRef2L5();
		award.getTotalRefL6();
		award.getTotalRetL6();
		award.getTotalRef2L6();
		
		/*System.out.println("Student name : "+name);
		System.out.println("Student ID   : "+ID);*/
		
		
		double MarksL5=Level5marks-minL5;
		double MarksL6=Level6marks-minL6;
		
		if(minL5<minL6){//if level5 min less than level6 min
			
			double Case1 = ((MarksL5/500)/3+((Level6marks/500)/3)*2)*100;
			
			if(Case1>=70){
				System.out.println("B.eng 1st Class Honours(1)\n");
			}else if(Case1>=60){
				System.out.println("B.eng 2nd Class Honours Upper Division(2:i)\n");
			}else if(Case1>=50){
				System.out.println("B.eng 2nd Class Honours Lower Division(2:ii)\n");
			}else if(Case1>=40){
				System.out.println("B.eng 3rd Class Honours(3)\n");
			}else{
				System.out.println("B.eng Normal Degree\n");
			}
		}else if(minL5>minL6){//if level5 min grater than level6 min
			
			double case2 = ((Level5marks/600)/3+((MarksL6/400)/3)*2)*100;
			
			if(case2>=70){
				System.out.println("B.eng 1st Class Honours(1)\n");
			}else if(case2>=60){
				System.out.println("B.eng 2nd Class Honours Upper Division(2:i)\n");
			}else if(case2>=50){
				System.out.println("B.eng 2nd Class Honours Lower Division(2:ii)\n");
			}else if(case2>=40){
				System.out.println("B.eng 3rd Class Honours(3)\n");
			}else{
				System.out.println("B.eng Normal Degree\n");
			}
		}else if(minL5==minL6){//if level5 min equal to level6 min
			
			double case3 = ((Level5marks/600)/3+((MarksL6/400)/3)*2)*100;
			
			if(case3>=70){
				System.out.println("B.eng 1st Class Honours(1)\n");
			}else if(case3>=60){
				System.out.println("B.eng 2nd Class Honours Upper Division(2:i)\n");
			}else if(case3>=50){
				System.out.println("B.eng 2nd Class Honours Lower Division(2:ii)\n");
			}else if(case3>=40){
				System.out.println("B.eng 3rd Class Honours(3)\n");
			}else{
				System.out.println("B.eng Normal Degree\n");
			}
		}else if(p<6){//if level5 pass modules less than 6
			
			double case4 = ((Level5marks-40/500)/3+((Level6marks/500)/3)*2)*100;
			
			if(case4>=70){
				System.out.println("B.eng 1st Class Honours(1)\n");
			}else if(case4>=60){
				System.out.println("B.eng 2nd Class Honours Upper Division(2:i)\n");
			}else if(case4>=50){
				System.out.println("B.eng 2nd Class Honours Lower Division(2:ii)\n");
			}else if(case4>=40){
				System.out.println("B.eng 3rd Class Honours(3)\n");
			}else{
				System.out.println("B.eng Normal Degree\n");
			}
		}else if(q<5){//if level6 pass modules less than 5
			
			double case5 = ((Level5marks/600)/3+((Level6marks-40/400)/3)*2)*100;
			
			if(case5>=70){
				System.out.println("B.eng 1st Class Honours(1\n)");
			}else if(case5>=60){
				System.out.println("B.eng 2nd Class Honours Upper Division(2:i)\n");
			}else if(case5>=50){
				System.out.println("B.eng 2nd Class Honours Lower Division(2:ii)\n");
			}else if(case5>=40){
				System.out.println("B.eng 3rd Class Honours(3)\n");
			}else{
				System.out.println("B.eng Normal Degree\n");
			}
		}else if(p==q){//if level5 pass modules equal to level6 pass modules
			
			double case6 = ((Level5marks/600)/3+((Level6marks-40/400)/3)*2)*100;
			
			if(case6>=70){
				System.out.println("B.eng 1st Class Honours(1)");
			}else if(case6>=60){
				System.out.println("B.eng 2nd Class Honours Upper Division(2:i)");
			}else if(case6>=50){
				System.out.println("B.eng 2nd Class Honours Lower Division(2:ii)");
			}else if(case6>=40){
				System.out.println("B.eng 3rd Class Honours(3)");
			}else{
				System.out.println("B.eng Normal Degree");
			}
		}
		
			Scanner sc=new Scanner(System.in);//asking for next Student
			System.out.println("ENTER 'y' TO CONTINUE FOR THE NEXT STUDENT\nENTER 'n' TO EXIT");//asking for next student
			
			char input=sc.next().charAt(0);
			
			if(input=='y'){
				
				Login login=new Login();
				login.RegisterStudents();
			}else{
				System.out.println("THANK YOU");
			}
	}	
	

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Award.name = name;
	}

	public static String getID() {
		return ID;
	}

	public static void setID(String iD) {
		ID = iD;
	}

	public static double getLevel5marks() {
		return Level5marks;
	}

	public static void setLevel5marks(double level5marks) {
		Level5marks = level5marks;
		
			}
}
