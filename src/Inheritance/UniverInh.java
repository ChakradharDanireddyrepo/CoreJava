/**
 * 
 */
package Inheritance;

import java.util.Scanner;

/**
 * @author Chakradhar
 *
 */
public class UniverInh {
private String uname,location;
Scanner s=new Scanner(System.in);
void read(){
	System.out.println("Enter University name");
	uname=s.nextLine();
	System.out.println("Enter University Location");
	location=s.nextLine();
}
void disp(){
	System.out.println("University Details");
	System.out.println("************************");
	System.out.println(uname+"  "+location);
	System.out.println("************************");
}
}
