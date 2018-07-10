
import java.util.Scanner;
public class Main2
{

	public static void main(String[] args)
	{
	int a[]=new int[100];
	int i,j,k,total=0;
	System.out.println("enter any 5 numbers");
	Scanner sc=new Scanner(System.in);
	for(i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
		
	}

for(i=0;i<5;i++)
{
	total=total+a[i];
}
System.out.println("total is"+total);
	}
}
