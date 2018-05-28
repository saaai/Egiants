
//refers to ExceptionDemo.java execute this first


//for creating an user defined exception

public class MyException extends Exception {

	//deafualt constructor is already here if we write it here or not.
	MyException()//creating constructor
	{
		super("From input: 0");//parent class here is exception class
		System.out.println("you have entered a wrong input:");
		
	}
}
