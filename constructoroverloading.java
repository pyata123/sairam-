import java.util.*;
class Student
{
int rollno;
String name;
int marks;
int rank;
Student(int r,String n,int m)
{
rollno=r;
name=n;
marks=m;
}
Student(int r,String n,int m,int rnk)
{
rollno=r;
name=n;
marks=m;
rank=rnk;
}
void displayStudent()
{
System.out.println(rollno);
System.out.println(name);
System.out.println(marks);
System.out.println(rank);
}
}
class ExecuteStudent
{
public static void main(String args[])
{
Student S1,S2;
S1=new Student(101,"rao",97,1);
S2=new Student(102,"reddy",65);
S1.displayStudent();
S2.displayStudent();
}
}