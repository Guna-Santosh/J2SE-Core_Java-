package TEST;
public class COJ_18_ScienceStudent extends COJ_18_STUDENT
{
	private int physicsMarks=85;
	private int chemistryMarks=95;
	private int mathsMarks=75;
	
	public COJ_18_ScienceStudent(String studentName, String studentClass, int totalNoStudents)
	{
		super(studentName, studentClass, totalNoStudents);
		
		System.out.println(studentName);
		System.out.println(studentClass);
		System.out.println(totalNoStudents);
		
	}
    public int getPercentage() 
	{   
		int k=0;
	    k=((physicsMarks+chemistryMarks+mathsMarks)*100)/300;
		return k;
	}
//
////	public int getPhysicsMarks() {
////		return physicsMarks;
////	}
//
//
//
//	public void setPhysicsMarks(int physicsMarks) {
//		this.physicsMarks = physicsMarks;
//	}
//
//
//
////	public int getChemistryMarks() {
////		return chemistryMarks;
////	}
//
//
//
//	public void setChemistryMarks(int chemistryMarks) {
//		this.chemistryMarks = chemistryMarks;
//	}
//
//
//
////	public int getMathsMarks() {
////		return mathsMarks;
////	}
//
//
//
//	public void setMathsMarks(int mathsMarks) {
//		this.mathsMarks = mathsMarks;
//	}



	



	
	

}
