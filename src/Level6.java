import java.util.*;

public class Level6 {

	public void Level6Marks(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nLEVEL 6 - 3RD YEAR\n");//Level 6 Module
		int count=0;//set count to get fail modules in level6
		int count1=0;//set count to get fail modules in referral L6
		int count2=0;//count to get fail modules in retakeL6
		int count3=0;//count to get fail modules in referral2L6
		int TotL6=0;//count to get total marks
		int q=0;//set count to get pass module
		int RefL6=0;//count to get referral pass modules
		int RetL6=0;//count to get ratake pass modules
		int Ref2L6=0;//count to get referral2 pass modules
		
		try{
		
		ArrayList<Double> list=new ArrayList<Double>();//set array to get min
		
			for(int i=1; i<=5; i++){//loop for six modules
				
			System.out.println(" Enter Module "+i+" Marks");//display level6 modules	
			
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
				System.out.println("Pass\n");TotL6+=AvgMod;q+=0;
				list.add(AvgMod);
			}else{
				System.out.println("Fail\n");count++;TotL6+=40;
				list.add(40.0);
			}
		}
			double minL6=100;//take min marks in L5
			for(double val : list){
				if(val<minL6){
					minL6=val;
				}
			}
			
			double Level6Marks = TotL6;
			Award award=new Award();
			award.setLevel6marks(Level6Marks);//getting level6 marks to the award class 
			award.setMinL6(minL6);//getting level6 min marks to the award class 
			award.setQ(q);//getting level6 pass modules to the award class 
			
		if(count==0){
			
			System.out.println("Student has PASS all modules welcome to AWARD PAGE\n");
			
			
			award.Result();
			
		}else if(count>3){
			
			System.out.println("Student has got DipHE\n");
			
			char input = 0;
			
			System.out.println("ENTER 'y' TO CONTINUE FOR THE NEXT STUDENT\nENTER 'n' TO EXIT");//asking for next student
			input=sc.next().charAt(0);
			if(input=='y'){
				
				Login login=new Login();
				login.RegisterStudents();
			}else{
				System.out.println("THANK YOU");
			}
			
		}else{
		
			System.out.println("Student has FAIL "+count+" modules enter REFERRAL marks\n");
			
			System.out.println("REFERRAL MODULES");//referral marks L6
			for(int x=1; x<=count; x++){
				
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
					System.out.println("Pass\n");RefL6+=1;
				}else{
					System.out.println("Fail\n");RefL6+=1;
					count1++;
				}
				
				award=new Award();
				award.setTotalRefL6(RefL6);
				
			}if(count1==0){
				System.out.println("Student has PASS all modules welcome to AWARD PAGE\n");
				
				
				award.Result();
				
			}else{
				System.out.println("Student has fail REFERRAL module\n");
			
				System.out.println("RETAKE MODULES");//retake L6 marks
				for(int y=1; y<=count1; y++){
					
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
						System.out.println("Pass\n");RetL6+=1;
					}else{
						System.out.println("Fail\n");RetL6+=1;
						count2++;
					}
					}
				
				    award=new Award();
				    award.setTotalRetL6(RetL6);
				
				}if(count2==0){
					System.out.println("Student has PASS all modules welcome to AWARD PAGE\n");
					
					
					award.Result();
					
				}else{
					System.out.println("Student has fail RETAKE module\n");
					
					System.out.println("REFERRAL 2 MODULES");//referral2 L6 marks
					for(int z=1; z<=count2; z++){
						
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
							System.out.println("Pass\n");Ref2L6+=1;
						}else{
							System.out.println("Fail\n");Ref2L6+=1;
							count3++;
						}
						}
					
						award=new Award();
						award.setTotalRef2L6(Ref2L6);
					
				}if(count3==0){
					System.out.println("Student has PASS all modules welcome AWARD PAGE\n");
					
					
					award.Result();
					
				}else{
					System.out.println("Student has got DipHE\n");
					
					char input = 0;
					
					System.out.println("ENTER 'y' TO CONTINUE FOR THE NEXT STUDENT\nENTER 'n' TO EXIT");//asking for next student
					input=sc.next().charAt(0);
					if(input=='y'){
						
						Login login=new Login();
						login.RegisterStudents();
					}else{
						System.out.println("THANK YOU");		
					}
				}
			}
		}catch(Exception e){
			System.err.println("INVALID MARKS\n");
			Level6Marks();
		}
		
	}
	}


