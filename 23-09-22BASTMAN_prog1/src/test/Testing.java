package test;
class Testing extends Batsman 
{
	Testing()
	{
		super("santosh",8000,8);
	}
public static void main(String[] args) 
{
	 Testing test=new Testing();
	 test.computeBattingAverage();
	 test.getStatistics();
}//end of main()
}//end of class