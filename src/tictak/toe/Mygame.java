package tictak.toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



class Mygame extends JFrame implements ActionListener {
	
	JButton button[] = new JButton[9];
	JLabel text = new JLabel();
	JPanel title= new JPanel();
	JPanel body= new JPanel();
	boolean player;
	Random random= new Random();
	
	
	Mygame()  {
		
		setLayout(new BorderLayout());
		setSize(800,740);
		getContentPane().setBackground(new Color(250,250,250));
		setBounds(250,0,800,740);
		setVisible(true);
		
		
		text.setBackground(new Color(25,25,25));
		text.setForeground(new Color(25,225,0));
		text.setText("Tic-Tac-Toe");
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setFont(new Font("Ink free",Font.BOLD,75));
		text.setOpaque(true);
		
		
		
		title.setLayout(new BorderLayout());
		title.setBounds(0,0,800,100);
		title.add(text);
		add(title,BorderLayout.NORTH);
		
		
		
		for(int i=0;i<9;i++) {
			button[i] =new JButton();
			button[i].setFont(new Font("MV boli",Font.BOLD,120));
			button[i].addActionListener(this);
			button[i].setFocusable(false);
			body.add(button[i]);
		}
		
		body.setLayout(new GridLayout(3,3));
		body.setBackground(new Color(150,150,150));
		add(body);
		
		turn();
	}
	
	public void check() {
		
		 if((button[0].getText()== "X") &&
		          (button[1].getText()== "X") &&
		          (button[2].getText()== "X") ) {
		           xwins(0,1,2);
		           }
		       
		        if((button[3].getText()== "X") &&
		          (button[4].getText()== "X") &&
		          (button[5].getText()== "X") ) {
		           xwins(3,4,5);
		           }
		        
		         if((button[6].getText()== "X") &&
		          (button[7].getText()== "X") &&
		          (button[8].getText()== "X") ) {
		           xwins(6,7,8);
		           }
		         
		          if((button[0].getText()== "X") &&
		          (button[3].getText()== "X") &&
		          (button[6].getText()== "X") ) {
		           xwins(0,3,6);
		           }
		          
		          if((button[1].getText()== "X") &&
		          (button[4].getText()== "X") &&
		          (button[7].getText()== "X") ) {
		           xwins(1,4,7);
		           }
		          
		          if((button[2].getText()== "X") &&
		          (button[5].getText()== "X") &&
		          (button[8].getText()== "X") ) {
		           xwins(2,5,8);
		           }
		          
		          if((button[0].getText()== "X") &&
		          (button[4].getText()== "X") &&
		          (button[8].getText()== "X") ) {
		           xwins(0,4,8);
		           }
		          
		          if((button[2].getText()== "X") &&
		          (button[4].getText()== "X") &&
		          (button[6].getText()== "X") ) {
		           xwins(2,4,6);
		           }
		          
		          
		          
		          
		          
		          
		          if((button[0].getText()== "O") &&
		          (button[1].getText()== "O") &&
		          (button[2].getText()== "O") ) {
		           owins(0,1,2);
		           }
		       
		        if((button[3].getText()== "O") &&
		          (button[4].getText()== "O") &&
		          (button[5].getText()== "O") ) {
		           owins(3,4,5);
		           }
		        
		         if((button[6].getText()== "O") &&
		          (button[7].getText()== "O") &&
		          (button[8].getText()== "O") ) {
		           owins(6,7,8);
		           }
		         
		          if((button[0].getText()== "O") &&
		          (button[3].getText()== "O") &&
		          (button[6].getText()== "O") ) {
		           owins(0,3,6);
		           }
		          
		          if((button[1].getText()== "O") &&
		          (button[4].getText()== "O") &&
		          (button[7].getText()== "O") ) {
		           owins(1,4,7);
		           }
		          
		          if((button[2].getText()== "O") &&
		          (button[5].getText()== "O") &&
		          (button[8].getText()== "O") ) {
		           owins(2,5,8);
		           }
		          
		          if((button[0].getText()== "O") &&
		          (button[4].getText()== "O") &&
		          (button[8].getText()== "O") ) {
		           owins(0,4,8);
		           }
		          
		          if((button[2].getText()== "O") &&
		          (button[4].getText()== "O") &&
		          (button[6].getText()== "O") ) {
		           owins(2,4,6);
		           }
		
	}
	public void turn( ) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2) == 1) {
			player= true;
			text.setText("X turn");
			
			
		}
		else  {
			player= false;
			text.setText("O turn");
		}
		
	}

	
	
	public void xwins(int a ,int b, int c) {
		 button[a].setBackground(Color.RED);
	        button[b].setBackground(Color.RED);
	         button[c].setBackground(Color.RED);
	       
	       
	         for(int i=0;i<9;i++){
	             button[i].setEnabled(false);
	         }
	         text.setText("X Wins");
	         
	         JOptionPane.showMessageDialog(null," \"X Wins The Game\"");
	    
		
		
	}
	public void owins(int a, int b, int c) {
		 button[a].setBackground(Color.RED);
	        button[b].setBackground(Color.RED);
	         button[c].setBackground(Color.RED);
	       
	       
	         for(int i=0;i<9;i++){
	             button[i].setEnabled(false);
	         }
	         text.setText("O Wins");
	         
	         JOptionPane.showMessageDialog(null," \"O Wins The Game \"");
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		for(int i=0;i<9;i++) {
			if(ae.getSource() == button[i]) {
				if(player) {
				if(button[i].getText() == "") {
					
					button[i].setText("X");
					button[i].setForeground(new Color(255,0,0));
					player= false;
					text.setText("O turn");
					check();
				}
			}
			else {
				button[i].setText("O");
				button[i].setForeground(new Color(0,0,255));
				player= true;
				text.setText("X turn");
				check();
			}
		  }
		}
		
		
	}
	
	public void main()
	{
		new Mygame();
	}
	
}