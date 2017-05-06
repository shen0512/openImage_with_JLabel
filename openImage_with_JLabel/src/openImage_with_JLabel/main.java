package openImage_with_JLabel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

class main{
	public static void main(String args[]){
		JFrame frame=new JFrame();
		ImageIcon image=new ImageIcon("123.jpg");
		JLabel label=new JLabel(image);
		JScrollPane scroll=new JScrollPane(label);
		frame.add(scroll);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
