/**
 * 
 */
package Inheritance;

/**
 * @author Chakradhar
 *
 */
public class PG extends UniverInh {

	/**
	 * @param args
	 */
	int stno;
	String sname,scourse;
	void pgRead(){
		System.out.println("Enter Student Number");
		stno=s.nextInt();
		s.nextLine();
		System.out.println("Enter Student Name");
		sname=s.nextLine();
		System.out.println("Enter Student course");
		scourse=s.nextLine();
		read();
	}
	void pgDisp(){
		System.out.println("PG Student Details");
		System.out.println("*********************************");
		System.out.println(stno+"  "+sname+"  "+scourse);
		System.out.println("*********************************");
		disp();
	}

}
