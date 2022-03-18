package practice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class javaswing extends JFrame{
	JLabel label1;
	JButton button1;
	JTextField textfield1;
	JTextArea textarea1;
	int buttonClicked;	
	
	public static void main(String[] args){
		
		new javaswing();
		
	}
	
	public javaswing(){
		this.setSize(500,500);
		
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setTitle("my first frame");
		
		
		JPanel panel = new JPanel();
		label1 = new JLabel("first label");
		button1 =  new JButton("1st button");
		textfield1 = new JTextField("Type Here", 15);
		textarea1 = new JTextArea(10,10);
		textarea1.setLineWrap(true);
        textarea1.setWrapStyleWord(true);
           	
		JScrollPane scrollbar1 = new JScrollPane(textarea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
				
		

			
		ListenForButton lForButton =  new ListenForButton();
		ListenForKeys lForKeys =  new ListenForKeys();
		
		
		
		button1.addActionListener(lForButton);
		textfield1.addKeyListener(lForKeys);


		panel.add(textfield1);
		panel.add(button1);
		panel.add(label1);
			
		panel.add(scrollbar1);
		
		this.add(panel);
		
		this.setContentPane(panel);	
		
		
		this.setVisible(true);
		
	}
	
	private class ListenForButton implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == button1){
				buttonClicked++;
				
				textarea1.append("Button Clicked " + buttonClicked + " times\n");
				
				
			}
			
		}
			
	}
	
	private class ListenForKeys implements KeyListener{

	
		public void keyTyped(KeyEvent e) {
			textarea1.append("Key typed: " + e.getKeyChar() + "\n");
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			textarea1.append("Key pressed: " + e.getKeyChar() + "\n");
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			textarea1.append("Key released: " + e.getKeyChar() + "\n");
			
		}
		
		
		
	}
	
	
}
/*
size

location
visibility


*/ 