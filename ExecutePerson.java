
class Person
{
String name;
int age;
void setPerson(String n,int a)
{
	name=n;
	age=a;
}
void displayPerson()
{
	System.out.println("Name="+name);
	System.out.println("Age="+age);
}
}
class Student extends Person
{
	int rollno;
	int marks;
	void setStudent(String n,int a,int r,int m)
	{
		setPerson(n,a);
		rollno=r;
		marks=m;
	
	}
	void displayStudent()
	{
		displayPerson();
		System.out.println("Rollno="+rollno);
		System.out.println("Marks="+marks);
	}
	
}
class Employee extends Person
{
	int empid;
	float empsal;
	void setEmployee(String n,int a,int eid,float esal)
	{
		setPerson(n,a);
		empid=eid;
		empsal=esal;
	
	}
	void displayEmployee()
	{
		displayPerson();
		System.out.println("Employeeid="+empid);
		System.out.println("Employeesalary="+empsal);
	}
	
}

public class ExecutePerson
{

	public static void main(String[] args) 
	{
       Student s1=new Student();
       Student s2=new Student();
       Employee e1=new Employee();
       Employee e2=new Employee();
       s1.setStudent("sairam", 23, 444, 100);
       s2.setStudent("harish", 23, 435, 97);
       e1.setEmployee("reddy", 23, 14, 10000);
       e2.setEmployee(" rao", 27, 14, 40000);
       s1.displayStudent();
       s2.displayStudent();
       e1.displayEmployee();
       e2.displayEmployee();
       
	}

}
