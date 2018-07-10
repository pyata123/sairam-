
import java.util.*;
class A
{
    static int i;
	int j=i-1;
	
		void m()
		{
		i=i*j;
		j=j-1;
		if(j==0)
		{
			System.out.println("fact of given number is\n"+i);
			return;
		}
		m();
	    }
}
class ExecuteA
{
    public static void main(String[] args)
	{
	int b;
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter a number");
	b=Sc.nextInt();
	A a=new A();
    a.i=b;
	a.m();
	}
}
