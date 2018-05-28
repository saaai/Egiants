//refers to ParentClass.java
//refers to ChildClass.java
//execute this InheritDemo.java first

class InheritDemo
{
	public static void main (String args[])
	{
		ChildClass cc = new ChildClass(100);/*whenever i am asking to execute child class parameterized constructor,
		 it should only execute that child class parameterized constructor*/
		System.out.println(cc.add());
	}
}