import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Level4 {
	
	public void Level4Marks() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nLEVEL 4 - 1ST YEAR\n");//Level 4 Module
		
		//Level4 module marks
		int count=0;//count to get fail modules in level4
		int count1=0;//count to get fail modules in ReferralL4
		int count2=0;//count to get fail modules in retakeL4
		int count3=0;//count to get fail modules in referral2L4
		int TotL4=0;//count to get marks of L5
		int RefL4=0;//count to get referral pass modules
		int RetL4=0;//count to get ratake pass modules
		int Ref2L4=0;//count to get referral2 pass modules
		
		try{
			
		for(int i=1; i<=6; i++){//loop for six modules
			
			System.out.println(" Enter Module "+i+" Marks");//display Level4 modules 
			
			System.out.print("  Module " + i + "(ICT-1) :");
			int ModIct1=sc.nextInt();
			
			while(ModIct1>100 || ModIct1<0){//check the marks
				System.err.println("input marks between 0-100");
				System.err.print("  Module " + i + "(ICT-1) :");
				ModIct1=sc.nextInt();
			}
			
			System.out.print("  Module " + i + "(ICT-2) :");
			int ModIct2=sc.nextInt();
			
			while(ModIct2>100 || ModIct2<0){//check the marks
				System.err.println("input marks between 0-100");
				System.err.print("  Module " + i + "(ICT-2) :");
				ModIct2=sc.nextInt();
			}
			
			System.out.print("  Module " + i + "(ICT-3) :");
			int ModIct3=sc.nextInt();
			
			while(ModIct3>100 || ModIct3<0){//check the marks
				System.err.println("input marks between 0-100");
				System.err.print("  Module " + i + "(ICT-3) :");
				ModIct3=sc.nextInt();
			}
			
			double AvgMod = (ModIct1+ModIct2+ModIct3)/3;
			//check pass or Fail
			if (AvgMod>=40){
				System.out.println("Pass\n");TotL4 +=AvgMod;
			}else{
				System.out.println("Fail\n");count+=1;TotL4 +=40;
			}
		}
		
		Award award=new Award();
		award.setTotL4(TotL4);
		
		switch(count){
		case 0:{//if students pass all modules in level4	
			System.out.println("Student has PASS all modules welcome to LEVEL 5");
			
			Level5 level5=new Level5();
			level5.Level5Marks();
			
		};break;
		case 1:{//if student fail one module in level4
			System.out.println("Student has Fail one module, student received CONDONED");
			
			Level5 level5=new Level5();
			level5.Level5Marks();
			
		};break;
		case 2:{//if student fail two module in level4
			System.out.println("Student has Fail two modules, student received CONDONED");
			
			Level5 level5=new Level5();
			level5.Level5Marks();
			
		};break;
		case 3:{//if student fail tree modules level4(referral marks)
			System.out.println("Student has FAIL three modules enter REFERRAL marks\n");
			
			System.out.println("REFERRAL MODULES");//referral marks
			for(int i=1; i<=3; i++){
				
				System.out.print("(ICT-1) :");
				int Ref1Ict1=sc.nextInt();
				
				while(Ref1Ict1>100 || Ref1Ict1<0){//check the marks
					System.err.println("input marks between 0-100");
					System.err.print("(ICT-1) :");
					Ref1Ict1=sc.nextInt();
				}
				
				System.out.print("(ICT-2) :");
				int Ref1Ict2=sc.nextInt();
				
				while(Ref1Ict2>100 || Ref1Ict2<0){//check the marks
					System.err.println("input marks between 0-100");
					System.err.print("(ICT-2) :");
					Ref1Ict2=sc.nextInt();
				}
				
				System.out.print("(ICT-3) :");
				int Ref1Ict3=sc.nextInt();
				
				while(Ref1Ict3>100 || Ref1Ict3<0){//check the marks
					System.err.println("input marks between 0-100");
					System.err.print("(ICT-3) :");
					Ref1Ict3=sc.nextInt();
				}
				
				double AvgRef1 = (Ref1Ict1+Ref1Ict2+Ref1Ict3)/3;
				//check pass or Fail
				if (AvgRef1>=40){
					System.out.println("Pass\n");RefL4+=1;
				}else{
					System.out.println("Fail\n");RefL4+=1;
					count1++;
				}
				
				award=new Award();
				award.setTotalRefL4(RefL4);
				
			}if(count1==0){
				System.out.println("Student has PASS all modules welcome to LEVEL 5");
				
				Level5 level5=new Level5();
				level5.Level5Marks();
				
			}else{
				System.out.println("Student has fail REFERRAL module\n");
			
				System.out.println("RETAKE MODULES");//retake L4 marks
				for(int j=1; j<=count1; j++){
					
					System.out.print("(ICT-1) :");
					int RetIct1=sc.nextInt();
					
					while(RetIct1>100 || RetIct1<0){//check the marks
						System.err.println("input marks between 0-100");
						System.err.print("(ICT-1) :");
						RetIct1=sc.nextInt();
					}
					
					System.out.print("(ICT-2) :");
					int RetIct2=sc.nextInt();
					
					while(RetIct2>100 || RetIct2<0){//check the marks
						System.err.println("input marks between 0-100");
						System.err.print("(ICT-2) :");
						RetIct2=sc.nextInt();
					}
					
					System.out.print("(ICT-3) :");
					int RetIct3=sc.nextInt();
					
					while(RetIct3>100 || RetIct3<0){//check the marks
						System.err.println("input marks between 0-100");
						System.err.print("(ICT-3) :");
						RetIct3=sc.nextInt();
					}
					
					double AvgRet = (RetIct1+RetIct2+RetIct3)/3;
					//check pass or Fail
					if (AvgRet>=40){
						System.out.println("Pass\n");RetL4+=1;
					}else{
						System.out.println("Fail\n");RetL4+=1;
						count2++;
					}
					}
					
					award=new Award();
					award.setTotalRetL4(RetL4);
					
				}if(count2==0){
					System.out.println("Student has PASS all modules welcome to LEVEL 5\n");
					
					Level5 level5=new Level5();
					level5.Level5Marks();
					
				}else{
					System.out.println("Student has fail RETAKE module\n");
					
					System.out.println("REFERRAL 2 MODULES");//referral2 L4 marks
					for(int x=1; x<=count2; x++){
						
						System.out.print("(ICT-1) :");
						int Ref2Ict1=sc.nextInt();
						
						while(Ref2Ict1>100 || Ref2Ict1<0){//check the marks
							System.err.println("input marks between 0-100");
							System.err.print("(ICT-1) :");
							Ref2Ict1=sc.nextInt();
						}
						
						System.out.print("(ICT-2) :");
						int Ref2Ict2=sc.nextInt();
						
						while(Ref2Ict2>100 || Ref2Ict2<0){//check the marks
							System.err.println("input marks between 0-100");
							System.err.print("(ICT-2) :");
							Ref2Ict2=sc.nextInt();
						}
						
						System.out.print("(ICT-3) :");
						int Ref2Ict3=sc.nextInt();
						
						while(Ref2Ict3>100 || Ref2Ict3<0){//check the marks
							System.err.println("input marks between 0-100");
							System.err.print("(ICT-3) :");
							Ref2Ict3=sc.nextInt();
						}
						
						double AvgRef2 = (Ref2Ict1+Ref2Ict2+Ref2Ict3)/3;
						//check pass or Fail
						if (AvgRef2>=40){
							System.out.println("Pass\n");Ref2L4+=1;
						}else{
							System.out.println("Fail\n");Ref2L4+=1;
							count3++;
						}
						}
					
						award=new Award();
						award.setTotalRef2L4(Ref2L4);
					
				}if(count3==0){
					System.out.println("Student has PASS all modules welcome to LEVEL 5\n");
					
					Level5 level5=new Level5();
					level5.Level5Marks();
					
				}else{
					System.out.println("Student has been EXCLUDE\n");
					
					char input = 0;
					
					System.out.println("ENTER 'y' TO CONTINUE FOR THE NEXT STUDENT\nENTER 'n' TO EXIT");//asking for next student
					input=sc.next().charAt(0);
					if(input=='y'){
						
						Login login=new Login();
						login.RegisterStudents();
					}else{
						System.out.println("THANK YOU");
						break;
					}
				}
				
		};break;
		default:{ 
		System.out.println("Student has Fail more than three modules you have been EXCLUDE\n");
		
		char input = 0;
		
		System.out.println("ENTER 'y' TO CONTINUE FOR THE NEXT STUDENT\nENTER 'n' TO EXIT");//asking for next student
		input=sc.next().charAt(0);
		if(input=='y'){
			
			Login login=new Login();
			login.RegisterStudents();
		}else{
			System.out.println("THANK YOU");
			break;
		}
		};break;
		
		}
		}catch(Exception e){
			System.err.println("INVALID MARKS\n");
			Level4Marks();
		}
	}
}		