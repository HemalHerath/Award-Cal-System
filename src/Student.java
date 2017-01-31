import java.io.Serializable;

public class Student implements Serializable{

	private String StudentName;
	private String StudentId;
	private int TotalL4;
	private double TotalL5;
	private double TotalL6;
	private int TotRefL4;
	private int TotRetL4;
	private int TotRef2L4;
	private int TotRefL5;
	private int TotRetL5;
	private int TotRef2L5;
	private int TotRefL6;
	private int TotRetL6;
	private int TotRef2L6;

 public Student(String studentName, String studentId ,int totalL4 ,double totalL5 ,double totalL6 ,int totRefL4
		 ,int totRetL4 ,int totRef2L4 ,int totRefL5 ,int totRetL5 ,int totRef2L5 ,int totRefL6 ,int totRetL6 ,int totRef2L6) {
	super();
	this.StudentName = studentName;
	this.StudentId = studentId;
	this.TotalL4 = totalL4;
	this.TotalL5 = totalL5;
	this.TotalL6 = totalL6;
	this.TotRefL4 = totRefL4;
	this.TotRetL4 = totRetL4;
	this.TotRef2L4 = totRef2L4;
	this.TotRefL5 = totRefL5;
	this.TotRetL5 = totRetL5;
	this.TotRef2L5 = totRef2L5;
	this.TotRefL6 = totRefL6;
	this.TotRetL6 = totRetL6;
	this.TotRef2L6 = totRef2L6;
	
}

public int getTotRefL6() {
	return TotRefL6;
}

public void setTotRefL6(int totRefL6) {
	TotRefL6 = totRefL6;
}

public int getTotRetL6() {
	return TotRetL6;
}

public void setTotRetL6(int totRetL6) {
	TotRetL6 = totRetL6;
}

public int getTotRef2L6() {
	return TotRef2L6;
}

public void setTotRef2L6(int totRef2L6) {
	TotRef2L6 = totRef2L6;
}

public int getTotRefL5() {
	return TotRefL5;
}

public void setTotRefL5(int totRefL5) {
	TotRefL5 = totRefL5;
}

public int getTotRetL5() {
	return TotRetL5;
}

public void setTotRetL5(int totRetL5) {
	TotRetL5 = totRetL5;
}

public int getTotRef2L5() {
	return TotRef2L5;
}

public void setTotRef2L5(int totRef2L5) {
	TotRef2L5 = totRef2L5;
}

public int getTotRef2L4() {
	return TotRef2L4;
}

public void setTotRef2L4(int totRef2L4) {
	TotRef2L4 = totRef2L4;
}

public int getTotRetL4() {
	return TotRetL4;
}

public void setTotRetL4(int totRetL4) {
	TotRetL4 = totRetL4;
}

public int getTotRefL4() {
	return TotRefL4;
}

public void setTotRefL4(int totRefL4) {
	TotRefL4 = totRefL4;
}

public double getTotalL6() {
	return TotalL6;
}

public void setTotalL6(double totalL6) {
	TotalL6 = totalL6;
}

public double getTotalL5() {
	return TotalL5;
}

public void setTotalL5(double totalL5) {
	TotalL5 = totalL5;
}

public String getStudentName() {
	return StudentName;
}

@Override
public String toString() {
	return "   #Student StudentName       = " + StudentName +
			"\n   #StudentId                 = " + StudentId + 
			"\n\n   #L4 marks                  = " + TotalL4 + 
			"\n   #used L4 referral modules  = " + TotRefL4 +
			"\n   #used L4 retake modules    = " + TotRetL4 +
			"\n   #used L4 referral2 modules = " + TotRef2L4 +
			"\n\n   #L5 marks                  = " + (int)TotalL5 + 
			"\n   #used L5 referral modules  = " + TotRefL5 +
			"\n   #used L5 retake modules    = " + TotRetL5 +
			"\n   #used L5 referral2 modules = " + TotRef2L5 +
			"\n\n   #L6 marks                  = " + (int)TotalL6 +
			"\n   #used L6 referral modules  = " + TotRefL6 +
			"\n   #used L6 retake modules    = " + TotRetL6 +
			"\n   #used L6 referral2 modules = " + TotRef2L6 +
			"\n";
}

public int getTotalL4() {
	return TotalL4;
}

public void setTotalL4(int totalL4) {
	TotalL4 = totalL4;
}

public void setStudentName(String studentName) {
	StudentName = studentName;
}

public String getStudentId() {
	return StudentId;
}

public void setStudentId(String studentId) {
	StudentId = studentId;
}

}
