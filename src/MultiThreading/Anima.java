package MultiThreading;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.plaf.ColorChooserUI;

public class Anima extends Applet {
	String s="Read Java";
	public void init(){
		Color c=new Color(10);
		Color c1=new Color(50);
		setBackground(c);
		setForeground(c1);

}
	public void start(){
		AnimaDemo ad=new AnimaDemo();
		Thread t=new Thread(ad);
		t.start();
	}
	public void paint(Graphics g){
		Font f=new Font("Arial",100,200);
		g.setFont(f);
		g.drawString(s,100,100);
	}
	class AnimaDemo implements Runnable{
		public void run(){
			try{
				while(true)
				{
					char ch=s.charAt(0);
					s=s.substring(1,s.length());
					s=s+ch;
					Thread.sleep(1000);
					repaint();
				}
			}
				catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Problem in thread execution");
				}

}
}
}
