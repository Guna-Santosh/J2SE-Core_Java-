package interviewquestion;
import java.util.* ;
public class ArrayAllQuestions {
@SuppressWarnings("resource")											
	public static void main(String[] args) {
	System.err.println("------Interview Important Array Codes------");
	System.out.println("1. Print All Elements Of Array\n"
					 + "2. Copy One Array Ele Into Another Array\n"
					 + "3. Merge 2Arrays Ele Into 3rd Array\n"
					 + "4. Insert Element In Array Based On Index\n"
					 + "5. Insert Element In Array Based On Position\n"
					 + "5. Sort an Array Asc/Desc\n"
					 + "6. Delete An Element From Array\n"
					 + "7. Find Even & Odd Elements in Array\n"
					 + "8. Find Even & Odd Count In Array\n"
					 + "9. Remove An Duplicate Element From Array\n"
					 + "10.Find Nth Max Element In Array\n"
					 + "11.Find nTh Min Element In Array\n"
					 + "12.Find Which Type of Array E/O/Mixed\n"
					 + "13.Sum Of All Elements In Array\n"
					 + "14.Find Max And Min Differnce\n"
					 + "15.Find Missing Elements Form Array\n"
					 + "16.Sum Of Unique Elements In Array\n"
					 + "17.Reverse Each Element In Array\n"
					 + "18.How To Create & Prove Empty Array\n"
					 + "19.Find Less Then Element In Given Number\n"
					 + "20.Find Greater Then Element In Given Number\n"
					 + "21.Find SubArray That Adds To Given Number"
					 + "44.Find "
					   );
	
	
	System.err.println("Choice Any One Question");
	System.out.print("Which Output U Want = ");
	switch(new Scanner(System.in).nextInt())
	{ 
	case 1:	
		System.err.println("U Choice Print All Elements Of Array");
		System.out.print("a[i] Size = ");
		int a1s=new Scanner(System.in).nextInt();
		Integer a1[]=new Integer[a1s];
		for(int i=0;i<a1.length;i++) 
		 a1[i]=new Scanner(System.in).nextInt();
		System.out.println(Arrays.toString(a1));
		System.out.println("j jsjs hs");
	break;
	case 2: 
		System.err.println("2.Copy One Array Ele Into Another Array");
		System.out.print("a[i] Size = ");
		int a2s=new Scanner(System.in).nextInt();
		Integer a2[]=new Integer[a2s];
		Integer copy[]=new Integer[a2s];
		for(int i=0;i<a2.length;i++)
			a2[i]=new Scanner(System.in).nextInt();
		for(int i=0;i<a2s;i++)
		{
			copy[i]=a2[i];
		}
		System.out.println(Arrays.toString(copy));
	break;
	case 3:
		System.err.println("3.Merge 2Arrays Ele Into 3rd Array");
		Integer a3[]= {1,2,3,4,5};
		Integer b3[]= {6,7,8,9,10};
//		Integer c[][]= {a3,b3};
//		System.out.print("[ ");
//		for(Integer i[]:c)
//			for(Integer j:i)
//				System.out.print(j+" ");
//		System.out.print("]");
//		---Model 2---
		Integer c[]=new Integer[a3.length+b3.length] ;

		int z=0;
		for(Integer ele:a3) 
		{
			c[z]=ele;z++;
		}
		for(Integer ele:b3) 
		{
			c[z]=ele;z++;
		}
		System.out.println(Arrays.toString(c));
	break;
	case 4:
		System.out.println("4.Insert Element In Array Based On Index");
		System.out.print("a[i] Size = ");
		int size=new Scanner(System.in).nextInt();
		Integer a4[]=new Integer[10];
		for(int i=0;i<size;i++) 
		a4[i]=new Scanner(System.in).nextInt();
//		System.out.println(Arrays.toString(a4));
		System.out.print("Enter The Index = ");
		int Index=new Scanner(System.in).nextInt();
		System.out.print("Enter The Element = ");
		int ele=new Scanner(System.in).nextInt();
		for(int i=size;i>=Index;i--)
		{
			a4[i+1]=a4[i];
		}
		a4[Index]=ele;
		for(int i=0;i<=size;i++)
		System.out.println(a4[i]);
		
		
		
	break;
	case 5: break;
	case 6: break;
	case 7: break;
	case 8: break;
	case 9: break;
	case 10: break;
	case 11: break;
	case 12: break;
	case 13: break;
	case 14: break;
	case 15: break;
	case 16: break;
	case 17: break;
	case 18: break;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
