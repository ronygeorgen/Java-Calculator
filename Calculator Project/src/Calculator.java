

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener   {
	int count=0;
	String oldValue;
	boolean isOperatorClicked=false;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton divisioButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton multiplicatioButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton minusButton;
	JButton zeroButton;
	JButton clearButton;
	JButton equalButton;
	JButton plusButton;
	
    Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(460, 600);
        jf.setLocation(300, 140);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel=new JLabel();
        displayLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        displayLabel.setBounds(30, 30, 380, 80);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(nineButton);
        nineButton.addActionListener(this);

        divisioButton=new JButton("/");
        divisioButton.setBounds(330,130,80,80);
        divisioButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(divisioButton);
        divisioButton.addActionListener(this);
        
        

        fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton= new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sixButton);
        sixButton.addActionListener(this);

        multiplicatioButton=new JButton("x");
        multiplicatioButton.setBounds(330,230,80,80);
        multiplicatioButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(multiplicatioButton);
        multiplicatioButton.addActionListener(this);

        oneButton= new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton=new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(threeButton);
        threeButton.addActionListener(this);

        minusButton=new JButton("-");
        minusButton.setBounds(330,330,80,80);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(minusButton);
        minusButton.addActionListener(this);

        zeroButton=new JButton("0");
        zeroButton.setBounds(30,430,80,80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        clearButton=new JButton("c");
        clearButton.setBounds(130,430,80,80);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(clearButton);
        clearButton.addActionListener(this);

        equalButton=new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(equalButton);
        equalButton.addActionListener(this);

        plusButton=new JButton("+");
        plusButton.setBounds(330,430,80,80);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(plusButton);
        plusButton.addActionListener(this);

    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
			
		}else if(e.getSource()==nineButton){
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
			
		}else if (e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
			
		}else if (e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
			
		}else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
			
		}else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
			
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
				
			
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
			
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
			
			
			
		}else if(e.getSource()==equalButton) {
			
			String newValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			if(count==1) {
				float result=oldValueF+newValueF;
				displayLabel.setText(result+"");
				count=0;
			}else if(count==2){
				float result=oldValueF-newValueF;
				displayLabel.setText(result+"");
				count=0;
			}else if(count==3) {
				float result=oldValueF/newValueF;
				displayLabel.setText(result+"");
				count=0;
			}else if (count==4) {
				float result=oldValueF*newValueF;
				displayLabel.setText(result+"");
				count=0;
			}
			
			// here placing operators below:
		}else if(e.getSource()==plusButton) {
			count=1;
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
			
		}else if(e.getSource()==minusButton) {
			count=2;
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
		}else if(e.getSource()==divisioButton) {
			count=3;
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
			
		}else if(e.getSource()==multiplicatioButton) {
			count=4;
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
			
		}else if(e.getSource()==clearButton) {
			
			displayLabel.setText("");
			
		}
		
	}  
}

    

    
    

   