package exceptionhandling;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter value");
		try{
		int price=Integer.parseInt(s.nextLine());
		System.out.println("Price of pen="+price);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Please enter valid value");
		}

	}

}
