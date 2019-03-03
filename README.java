import java.io.*;
import java.util.*;
class Printknumber
{
public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=input.nextInt();
		System.out.println();
	}
	for(int j=0;j<a;j++)
	{
		if(b==arr[j])
		{
			System.out.println(arr[j]);
		}
	}
  }
}
	
	
