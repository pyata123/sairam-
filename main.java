package dt;
class Polygon
{
	void info()
	{
		System.out.println("closed container");
	}
}
public class main
{
public static void main(String args[])
{
	Square s=new Square();
	s.info();
}
}
class Square extends Polygon
{
	void info()
	{
		System.out.println("all sides same");
	}
	void area()
	{
System.out.println("area of Square");
}
}




