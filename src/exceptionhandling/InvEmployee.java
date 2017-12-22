package exceptionhandling;

import java.util.Scanner;

import userdefined.exception.NsalException;
import userdefined.exception.PsalException;

public class InvEmployee {

	public static void main(String[] args) throws NsalException {
		// TODO Auto-generated method stub
		System.out.println("Enter Salary");
		Scanner s=new Scanner(System.in);
		String sal=s.nextLine();
		Employee e=new Employee();
		try {
			e.decidesal(sal);
		} 
//		catch (NsalException ne) {
//			// TODO Auto-generated catch block
//			System.err.println("Invalid salary");//If NsalExpection is not user default message thrown
//		}
		catch (PsalException pe) {
			// TODO: handle exception
			System.err.println("Valid salary try for best");
		}
		catch (NumberFormatException nfe) {
			// TODO: handle exception
			System.err.println("Dont enter alpha numeric");
		}

	}

}
