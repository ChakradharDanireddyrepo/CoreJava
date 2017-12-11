/**
 * 
 */
package Inheritance;

/**
 * @author Chakradhar
 *
 */
public class UG extends UniverInh {
	int stno;
	String sname,scourse;
	void ugRead(){
		System.out.println("Enter Student number");
		stno=s.nextInt();
		s.nextLine();
		System.out.println("Enter Student name");
		sname=s.nextLine();
		System.out.println("Enter student course details");
		scourse=s.nextLine();
		read();//calling base class method
	}
	void ugDisp(){
		System.out.println("UG Student details");
		System.out.println("************************");
		System.out.println(stno+"  "+sname+"  "+scourse);
		System.out.println("************************");
		disp();//Base class method
	}

}
