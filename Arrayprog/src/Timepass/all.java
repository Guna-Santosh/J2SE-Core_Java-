package Timepass;

import java.util.Scanner;
public class all 
{
public static void main(String[] args) 
{
   Scanner s=new Scanner(System.in);
     int a[][]=new int[10][10];
    // a[0]=new int [2];
     int k[]=new int[10];
    
     for(int i=0;i<3;i++) 
     {
       for(int j=0;j<3;j++) 
       { 
    	   a[i][j]=s.nextInt();
       }
     }
     for(int i=0;i<3;i++) 
     {
        for(int j=0;j<3;j++)	 
        {    //if(i==j)
             k[j] =k[j]+a[j][j];
        }
   }for(int i=0;i<3;i++)
     System.out.print(k[i]+" ");
  }
}