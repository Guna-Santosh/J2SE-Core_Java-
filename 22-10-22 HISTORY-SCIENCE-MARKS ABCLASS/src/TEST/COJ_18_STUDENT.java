package TEST;
abstract class COJ_18_STUDENT 
{
     protected String studentName;
     protected String studentClass;
     protected static int totalNoStudents;

     abstract public int getPercentage( );
     
     public static int getTotalNoStudents( ) 
     {
    	 return 0;
     }
	public COJ_18_STUDENT() {}
	
	@SuppressWarnings("static-access")
	public COJ_18_STUDENT(String studentName, String studentClass, int totalNoStudents)
	{ 
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.totalNoStudents=totalNoStudents;
	}
     
}
