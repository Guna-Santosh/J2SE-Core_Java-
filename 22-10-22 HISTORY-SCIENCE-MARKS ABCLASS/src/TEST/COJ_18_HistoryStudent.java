package TEST;
public class COJ_18_HistoryStudent extends COJ_18_STUDENT
{
    private int historyMarks=85;
	private int civicsMarks=80;
	public COJ_18_HistoryStudent(String studentName, String studentClass, int totalNoStudents)
	{
		super(studentName, studentClass, totalNoStudents);
		System.out.println(studentName);
		System.out.println(studentClass);
		System.out.println(totalNoStudents);
	}
	public int getPercentage() 
	{  int k;
		k=((historyMarks+civicsMarks)*100)/200;
		return k;
	}
//     public COJ_18_HistoryStudent(int historyMarks, int civicsMarks)
//     {
//		 this.historyMarks = historyMarks;
//	     this.civicsMarks = civicsMarks;
//	 }

}
