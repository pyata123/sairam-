class A
{
	void m1()
	{
		System.out.println("from m1");
	}
}
class B extends A
{
	void m2()
	{
		m1();
	}
}
public class Main1 
{
public static void main(String args[])
{
	B b=new B();
}
}
