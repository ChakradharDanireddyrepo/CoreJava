package exceptionhandling;
import userdefined.exception.*;

public class Employee {
	public void decidesal(String sal) throws NsalException,PsalException,NumberFormatException{
		int salary=Integer.parseInt(sal);
		if(salary<0){
			NsalException ne=new NsalException("Invalid Salary");
			throw ne;
		}
		else{
			PsalException pe=new PsalException("Valid Salary");
			throw pe;
		}
	}
	

}
