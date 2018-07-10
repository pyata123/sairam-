import java.util.*;

class Fact
{
	int i;
	int j;
	int k;
void giveval(int a)
{
	i=a;
	j=i-1;
}
void factorial()
{
	i=i*j;
	j=j-1;
	if(j==0)
	{
		System.out.println(i);
		return;
	}
	factorial();
	
}
class Main
{
	public static void main(String args[])
	{
      int b;
      Fact f=new Fact();
      System.out.println("enter any number");
      Scanner s=new Scanner(Sytem.in);
      b=s.nextInt();
      f.giveval(b);
      f.factorial();

	}
}
