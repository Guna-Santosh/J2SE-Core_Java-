package test;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Frame {
	public static void main(String[] args) {
JFrame ob=new JFrame();
ob.setSize(800,800);
ob.setTitle("Santsoh");
ob.getContentPane().setBackground(Color.red);
ob.setVisible(true);
ob.setResizable(false);
ImageIcon img=new ImageIcon("brave.png");
ob.setIconImage(img.getImage());

	}

}
