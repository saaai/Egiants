
//refers to MyException.java

import java.io.*;

/**
 * 
 */

/**
 * @author saigopal
 *
 */
public class ExceptionDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MyException 
	 */
	public static void main(String[] args) throws IOException, MyException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Please enter a desired number:");
		String str = br.readLine();
		if(str.equals("0"))
		{
			//Raise Exception
			//Step1: create an object for the exception class
			MyException me = new MyException();
			throw me;//syntax : throw objectname which here is "me"
			//throws is ignoring the excetpion different from throw
			//throw me raising the exception manually/wantedly in the program
		}
		else{
			
			System.out.println("Program ended Successfully!!!");
		}
		
		

	}

}
