package packageDT11;
class A
{
	int i=0;
	int fact=1;
	void m()
	{
		i++;
		fact=fact*1;
		if(i==5)
		{
			System.out.println(fact);
			return;	
		}
		m();
	}
}
public class Execute
{

	public static void main(String[] args)
	{
	A a=new A();
	a.m();
	}
}
