package streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DisplayNumberReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		System.out.println("Enter File name");
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		try{
		fos=new FileOutputStream(s1,true);
		for(int i=1;i<=10;i++){
			fos.write(i);
		}
		System.out.println("Write completed");
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Cannot find file to write");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Unable to write date to file");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally{
			try{
			if(fos!=null){
		fos.close();
		System.out.println("File closed");
		File f=new File(".");
		String s3=f.getAbsolutePath();
		System.out.println(s3);
			}
			}
			catch (Exception e) {
				// TODO: handle exception
				System.err.println(e);
			}
			}
			
		}

	}

