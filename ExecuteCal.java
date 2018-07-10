package dt;
class A
{
int x;
void setA(int v1)
{
	x=v1;
}
}
class B extends A
{
	int y;
	void setData(int v1,int v2)
	{
		y=v2;
		setA(v1);
	}
}

public class ExecuteCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
