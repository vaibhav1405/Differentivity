import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;


public class Main implements ActionListener{
	JFrame frame;
	JLabel label;
	button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public JOptionPane dialog = new JOptionPane();
	JButton reset;
	Font f;
	JPanel panel;
	
	int flag = 0;
	int flag2 = 0;
	
	Main(){
		frame = new JFrame();
		label = new JLabel();
		reset = new JButton();
		panel = new JPanel();
		
	  
		
		f = new Font("Arial",Font.BOLD,15);
		reset.setSize(20,30);
		reset.setText("Reset");
		reset.setLayout(new java.awt.BorderLayout());
		reset.setBackground(Color.white);
		reset.addActionListener(this);
		dialog.add(reset);
		reset.setVisible(true);
		
		label.setText("Tic Tac Toe");
		label.setFont(f);
		label.setBounds(50, 300, 100, 40);
		label.setLayout(null);
		
		
		b1 = new button(10,90);
		b2 = new button(103,90);
		b3 = new button(196,90);
		b4 = new button(10,193);
		b5 = new button(103,193);
		b6 = new button(196,193);
		b7 = new button(10,296);
		b8 = new button(103,296);
		b9 = new button(196,296);
	
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		frame.setTitle("TIC TAC TOE");
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
	 	frame.add(panel);
		frame.add(reset);
		
	  frame.setSize(310,450);
  
      frame.setLayout(new GridLayout(4,30));
      frame.setVisible(true);

	}
	public void actionPerformed(ActionEvent e) {
		String message = null;
		flag++;
		  Graphics g = frame.getGraphics();
		if(e.getSource()==b1) {
			if(flag%2==0) {
				
				b1.setText("X");
			}
			else
				b1.setText("O");
			b1.setEnabled(false);
			
		}
		else if(e.getSource()==b2) {
			if(flag%2==0) {
				b2.setText("X");
			}
			else
				b2.setText("O");
			b2.setEnabled(false);
		}
		else if(e.getSource()==b3) {
			if(flag%2==0) {
			
				b3.setText("X");
			}
			else
				b3.setText("O");
			b3.setEnabled(false);
		}
			
		else if(e.getSource()==b4) {
			if(flag%2==0) {
				b4.setText("X");
			}
			else
				b4.setText("O");
			b4.setEnabled(false);
		}
			
		else if(e.getSource()==b5) {
			if(flag%2==0) {
				b5.setText("X");
			}
			else
				b5.setText("O");
			b5.setEnabled(false);
		}
			
		else if(e.getSource()==b6) {
			if(flag%2==0) {
				b6.setText("X");
			}
			else
				b6.setText("O");
			b6.setEnabled(false);
		}
		
		else if(e.getSource()==b7) {
			if(flag%2==0) {
				b7.setText("X");
			}
			else
				b7.setText("O");
			b7.setEnabled(false);
		}
			
		else if(e.getSource()==b8) {
			if(flag%2==0) {
				b8.setText("X");
			}
			else
				b8.setText("O");
			b8.setEnabled(false);
		}
			
		else if(e.getSource()==b9) {
			if(flag%2==0) {
				b9.setText("X");
			}
			else
				b9.setText("O");
			b9.setEnabled(false);
		}
		else if(e.getSource()==reset) {
			resetButtons();
			
		}
        
       if(b1.getText()==b2.getText()&& b2.getText()==b3.getText()) {
    	   if(b1.getText()=="X") {
    		   changeColor(b1,b2,b3);
    		   dialog.showMessageDialog(null,"Player 2 Won!");
    		   resetButtons();
    	   }
    		 
    	   else if(b1.getText()=="O") {
    		   changeColor(b1,b2,b3);
    		   dialog.showMessageDialog(null,"Player 1 Won!");
    		   resetButtons();
    	   }
       }
       else if(b3.getText()==b6.getText()&& b6.getText()==b9.getText()) {
    	   if(b3.getText()=="X") {
    		   changeColor(b3,b6,b9);
    		   dialog.showMessageDialog(null,"Player 2 Won!");
    		   resetButtons();
    	   }
    	   else if(b3.getText()=="O") {
    		   changeColor(b3,b6,b9);
    		   dialog.showMessageDialog(null,"Player 1 Won!");
    		   resetButtons();
    	   }
       }
       else if(b9.getText()==b8.getText()&& b8.getText()==b7.getText()) {
    	   if(b9.getText()=="X") {
    		   changeColor(b9,b8,b7);
    		   dialog.showMessageDialog(null,"Player 2 Won!");
    		   resetButtons();
    	   }
    	   else if(b9.getText()=="O") {
    		   changeColor(b9,b8,b7);
    		   dialog.showMessageDialog(null,"Player 1 Won!");
    	   resetButtons();
    	   }
       }
       else if(b7.getText()==b4.getText()&& b4.getText()==b1.getText()) {
    	   if(b7.getText()=="X") {
    		   changeColor(b7,b4,b1);
    		   dialog.showMessageDialog(null,"Player 2 Won!");
    		   resetButtons();
    	   }
    	   else if(b7.getText()=="O") {
    		   changeColor(b7,b4,b1);
    		   dialog.showMessageDialog(null,"Player 1 Won!");
    		   resetButtons();
    	   }
       }
       else if(b1.getText()==b5.getText()&& b5.getText()==b9.getText()) {
    	   if(b1.getText()=="X") {
    		   changeColor(b1,b5,b9);
    		   dialog.showMessageDialog(null,"Player 2 Won!");
    		   resetButtons();
    	   }
    	   else if(b1.getText()=="O") {
    		   changeColor(b1,b5,b9);
    		   dialog.showMessageDialog(null,"Player 1 Won!");
    		   resetButtons();
    	   }
       }
       else if(b3.getText()==b5.getText()&& b5.getText()==b7.getText()) {
    	   if(b3.getText()=="X") {
    		   changeColor(b3,b5,b7);
    		   dialog.showMessageDialog(null,"Player 2 Won!");
    		   resetButtons();
    	   }
    	   else if(b3.getText()=="O") {
    		   changeColor(b3,b5,b7);
    		   dialog.showMessageDialog(null,"Player 1 Won!");
    		   resetButtons();
    	   }
       }
       else if(b4.getText()==b5.getText()&& b5.getText()==b6.getText()) {
    	   if(b4.getText()=="X") {
    		   changeColor(b4,b5,b6);
    		   dialog.showMessageDialog(frame,"Player 2 Won!");
    		   resetButtons();
    	   }
    	   else if(b4.getText()=="O") {
    		   changeColor(b4,b5,b6);
    		   dialog.showMessageDialog(frame,"Player 1 Won!");
    		   resetButtons();
    	   }
       }
       else if(b7.getText()==b8.getText()&& b8.getText()==b9.getText()) {
    	   if(b7.getText()=="X") {
    		   changeColor(b7,b8,b9);
    		   dialog.showMessageDialog(frame,"Player 2 Won!");
    		   resetButtons();
    	   }
    	   else if(b7.getText()=="O") {
    		   changeColor(b7,b8,b9);
    		   dialog.showMessageDialog(frame,"Player 1 Won!");
    		   resetButtons();
    	   }
       }
       else if(b2.getText()==b5.getText()&& b5.getText()==b8.getText()) {
    	   if(b2.getText()=="X") {
    		   changeColor(b2,b5,b8);
    		   b2.setBackground(Color.red);
    		   dialog.showMessageDialog(frame,"Player 2 Won!");
    		   resetButtons();
    	   }
    	   else if(b2.getText()=="O") {
    		   changeColor(b2,b5,b8);
    		   b2.setBackground(Color.red);
    		   dialog.showMessageDialog(frame,"Player 1 Won!");
    		   resetButtons();
    	   }
       }
       else if(b1.isEnabled()&& b2.isEnabled() && b3.isEnabled() && b4.isEnabled() && b5.isEnabled() && b6.isEnabled() && b7.isEnabled() && b8.isEnabled() && b9.isEnabled()){
    	 
    	   dialog.showMessageDialog(null, "It's a Tie");
    	 resetButtons();
       }
    }
	void resetButtons() {
		flag = 0;
		b1.setText("");
		b1.setSelected(false);
		b1.setEnabled(true);
		
		b2.setText("");
		b2.setSelected(false);
		b2.setEnabled(true);
		
		b3.setText("");
		b3.setSelected(false);
		b3.setEnabled(true);
		
		b4.setText("");
		b4.setSelected(false);
		b4.setEnabled(true);
		
		b5.setText("");
		b5.setSelected(false);
		b5.setEnabled(true);
		
		b6.setText("");
		b6.setSelected(false);
		b6.setEnabled(true);
		
		b7.setText("");
		b7.setSelected(false);
		b7.setEnabled(true);
		
		b8.setText("");
		b8.setSelected(false);
		b8.setEnabled(true);
		
		b9.setText("");
		b9.setSelected(false);
		b9.setEnabled(true);
		
		b1.setBackground(null);
		b2.setBackground(null);
		b3.setBackground(null);
		b4.setBackground(null);
		b5.setBackground(null);
		b6.setBackground(null);
		b7.setBackground(null);
		b8.setBackground(null);
		b9.setBackground(null);
  }
	
	void changeColor(button b1, button b2, button b3) {
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
	}
	
	public static void main(String args[]) {
		new Main();
	}
}

class button extends JToggleButton{
	Font f = new Font("Dialog", Font.PLAIN, 35);
	button(int x, int y){
		setSize(90,90);
		setLocation(x,y);
		setLayout(null);
		setFont(f);
		setForeground(Color.black);
	}
}
	