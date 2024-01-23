import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Calculator implements ActionListener  {
	JFrame frame;
	JLabel displaylabel;
	JButton sevenbutton,eightbutton,ninebutton,fourbutton,fivebutton,sixbutton,onebutton,twobutton,threebutton,plusorminusbutton;
	JButton zerobutton,dotbutton,equalltobutton,plusbutton,miniusbutton,multiplaybutton,divisionbutton,backbutton,clearbutton,percentbutton;

	
	public Calculator() 
	{
		frame=new JFrame();
		frame.setLayout(null);
		frame.setSize(256, 446);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAlwaysOnTop(true);
		frame.setTitle("Samus Calc");


		displaylabel=new JLabel();
		
		displaylabel.getAutoscrolls();
		displaylabel.setBounds(0, 0, 240, 100);
		displaylabel.setBackground(Color.darkGray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.WHITE);
		displaylabel.setFont(new Font("Sans",Font.BOLD ,30));
		/*while(displaylabel.WIDTH < System.Windows.Forms.TextRenderer.MeasureText(displaylabel.Text, 
			     new Font(displaylabel.Font.FontFamily, displaylabel.Font.Size, displaylabel.Font.Style)).Width)
			{
			displaylabel.Font = new Font(displaylabel.Font.FontFamily, displaylabel.Font.Size - 0.5f, displaylabel.Font.Style);
			}*/
		frame.add(displaylabel);
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(0, 160, 60, 66);
		sevenbutton.setBackground(Color.black);
		sevenbutton.setForeground(Color.WHITE);
		sevenbutton.setBorder(new LineBorder(Color.white));
		sevenbutton.setFont(new Font("Sans",Font.BOLD ,36));
		sevenbutton.addActionListener(this);
		frame.add(sevenbutton);
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(60, 160, 60, 66);
		eightbutton.setBackground(Color.black);
		eightbutton.setForeground(Color.WHITE);
		eightbutton.setBorder(new LineBorder(Color.white));
		eightbutton.setFont(new Font("Sans",Font.BOLD ,36));
		eightbutton.addActionListener(this);
		frame.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(120, 160, 60, 66);
		ninebutton.setBackground(Color.black);
		ninebutton.setForeground(Color.WHITE);
		ninebutton.setBorder(new LineBorder(Color.white));
		ninebutton.setFont(new Font("Sans",Font.BOLD ,36));
		ninebutton.addActionListener(this);
		frame.add(ninebutton);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(0, 220, 60, 66);
		fourbutton.setBackground(Color.black);
		fourbutton.setForeground(Color.WHITE);
		fourbutton.setBorder(new LineBorder(Color.white));
		fourbutton.setFont(new Font("Sans",Font.BOLD ,36));
		fourbutton.addActionListener(this);
		frame.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(60, 220, 60, 66);
		fivebutton.setBackground(Color.black);
		fivebutton.setForeground(Color.WHITE);
		fivebutton.setBorder(new LineBorder(Color.white));
		fivebutton.setFont(new Font("Sans",Font.BOLD ,36));
		fivebutton.addActionListener(this);
		frame.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(120, 220, 60, 66);
		sixbutton.setBackground(Color.black);
		sixbutton.setForeground(Color.WHITE);
		sixbutton.setBorder(new LineBorder(Color.white));
		sixbutton.setFont(new Font("Sans",Font.BOLD ,36));
		sixbutton.addActionListener(this);
		frame.add(sixbutton);
		
		onebutton=new JButton("1");
		onebutton.setBounds(0, 280, 60, 66);
		onebutton.setBackground(Color.black);
		onebutton.setForeground(Color.WHITE);
		onebutton.setBorder(new LineBorder(Color.white));
		onebutton.setFont(new Font("Sans",Font.BOLD ,36));
		onebutton.addActionListener(this);
		frame.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(60, 280, 60, 66);
		twobutton.setBackground(Color.black);
		twobutton.setForeground(Color.WHITE);
		twobutton.setBorder(new LineBorder(Color.white));
		twobutton.setFont(new Font("Sans",Font.BOLD ,36));
		twobutton.addActionListener(this);
		frame.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(120, 280, 60, 66);
		threebutton.setBackground(Color.black);
		threebutton.setForeground(Color.WHITE);
		threebutton.setBorder(new LineBorder(Color.white));
		threebutton.setFont(new Font("Sans",Font.BOLD ,36));
		threebutton.addActionListener(this);
		frame.add(threebutton);
		
		plusorminusbutton=new JButton("+/-");
		plusorminusbutton.setBounds(0, 340, 60, 66);
		plusorminusbutton.setBackground(Color.black);
		plusorminusbutton.setForeground(Color.WHITE);
		plusorminusbutton.setBorder(new LineBorder(Color.white));
		plusorminusbutton.setFont(new Font("Sans",Font.BOLD ,36));
		plusorminusbutton.addActionListener(this);
		frame.add(plusorminusbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(60, 340, 60, 66);
		zerobutton.setBackground(Color.black);
		zerobutton.setForeground(Color.WHITE);
		zerobutton.setBorder(new LineBorder(Color.white));
		zerobutton.setFont(new Font("Sans",Font.BOLD ,36));
		zerobutton.addActionListener(this);
		frame.add(zerobutton);
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(120, 340, 60, 66);
		dotbutton.setBackground(Color.black);
		dotbutton.setForeground(Color.WHITE);
		dotbutton.setBorder(new LineBorder(Color.white));
		dotbutton.setFont(new Font("Sans",Font.BOLD ,36));
		dotbutton.addActionListener(this);
		frame.add(dotbutton);
		
		equalltobutton=new JButton("=");
		equalltobutton.setBounds(180, 340, 60, 66);
		equalltobutton.setBackground(Color.ORANGE);
		equalltobutton.setForeground(Color.WHITE);
		equalltobutton.setBorder(new LineBorder(Color.white));
		equalltobutton.setFont(new Font("Sans",Font.BOLD ,36));
		equalltobutton.addActionListener(this);
		frame.add(equalltobutton);
		
		plusbutton=new JButton("+");
		plusbutton.setBounds(180, 280, 60, 66);
		plusbutton.setBackground(Color.ORANGE);
		plusbutton.setForeground(Color.WHITE);
		plusbutton.setBorder(new LineBorder(Color.white));
		plusbutton.setFont(new Font("Sans",Font.BOLD ,36));
		plusbutton.addActionListener(this);
		frame.add(plusbutton);
		
		miniusbutton=new JButton("-");
		miniusbutton.setBounds(180, 220, 60, 66);
		miniusbutton.setBackground(Color.ORANGE);
		miniusbutton.setForeground(Color.WHITE);
		miniusbutton.setBorder(new LineBorder(Color.white));
		miniusbutton.setFont(new Font("Sans",Font.BOLD ,36));
		miniusbutton.addActionListener(this);
		frame.add(miniusbutton);
		
		multiplaybutton=new JButton("x");
		multiplaybutton.setBounds(180, 160, 60, 66);
		multiplaybutton.setBackground(Color.ORANGE);
		multiplaybutton.setForeground(Color.WHITE);
		multiplaybutton.setBorder(new LineBorder(Color.white));
		multiplaybutton.setFont(new Font("Sans",Font.BOLD ,36));
		multiplaybutton.addActionListener(this);
		frame.add(multiplaybutton);
		
		divisionbutton=new JButton("/");
		divisionbutton.setBounds(180, 100, 60, 66);
		divisionbutton.setBackground(Color.ORANGE);
		divisionbutton.setForeground(Color.WHITE);
		divisionbutton.setBorder(new LineBorder(Color.white));
		divisionbutton.setFont(new Font("Sans",Font.BOLD ,36));
		divisionbutton.addActionListener(this);
		frame.add(divisionbutton);
		
		backbutton=new JButton("<");
		backbutton.setBounds(120, 100, 60, 66);
		backbutton.setBackground(Color.LIGHT_GRAY);
		backbutton.setForeground(Color.WHITE);
		backbutton.setBorder(new LineBorder(Color.white));
		backbutton.setFont(new Font("Sans",Font.BOLD ,36));
		backbutton.addActionListener(this);
		frame.add(backbutton);
		
		clearbutton=new JButton("C");
		clearbutton.setBounds(60, 100, 60, 66);
		clearbutton.setBackground(Color.LIGHT_GRAY);
		clearbutton.setForeground(Color.WHITE);
		clearbutton.setBorder(new LineBorder(Color.white));
		clearbutton.setFont(new Font("Sans",Font.BOLD ,36));
		clearbutton.addActionListener(this);
		frame.add(clearbutton);
		
		percentbutton=new JButton("%");
		percentbutton.setBounds(0, 100, 60, 66);
		percentbutton.setBackground(Color.LIGHT_GRAY);
		percentbutton.setForeground(Color.WHITE);
		percentbutton.setBorder(new LineBorder(Color.white));
		percentbutton.setFont(new Font("Sans",Font.BOLD ,36));
		percentbutton.addActionListener(this);
		frame.add(percentbutton);
		
	}
	public static void main (String spg[]) 
	{
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton)
		{
			displaylabel.setText(displaylabel.getText()+"7");
		}
		if(e.getSource()==eightbutton)
		{
			displaylabel.setText(displaylabel.getText()+"8");
		}
		if(e.getSource()==ninebutton)
		{
			displaylabel.setText(displaylabel.getText()+"9");
		}
		if(e.getSource()==fourbutton)
		{
			displaylabel.setText(displaylabel.getText()+"4");
		}
		if(e.getSource()==fivebutton)
		{
			displaylabel.setText(displaylabel.getText()+"5");
		}
		if(e.getSource()==sixbutton)
		{
			displaylabel.setText(displaylabel.getText()+"6");
		}
		if(e.getSource()==onebutton)
		{
			displaylabel.setText(displaylabel.getText()+"1");
		}
		if(e.getSource()==twobutton)
		{
			displaylabel.setText(displaylabel.getText()+"2");
		}
		if(e.getSource()==threebutton)
		{
			displaylabel.setText(displaylabel.getText()+"3");
		}
		if(e.getSource()==plusorminusbutton)
		{
			displaylabel.setText(displaylabel.getText()+"-");
		}
		if(e.getSource()==zerobutton)
		{
			displaylabel.setText(displaylabel.getText()+"0");
		}
		if(e.getSource()==dotbutton)
		{
			displaylabel.setText(displaylabel.getText()+".");
		}
		if(e.getSource()==equalltobutton)
		{
			displaylabel.setText(displaylabel.getText()+"=");
			CoreFullVersion core=new CoreFullVersion(displaylabel.getText());
		}
		if(e.getSource()==plusbutton)
		{
			displaylabel.setText(displaylabel.getText()+"+");
			
		}
		if(e.getSource()==miniusbutton)
		{
			displaylabel.setText(displaylabel.getText()+"-");
		}
		if(e.getSource()==multiplaybutton)
		{
			displaylabel.setText(displaylabel.getText()+"*");
		}
		if(e.getSource()==divisionbutton)
		{
			displaylabel.setText(displaylabel.getText()+"/");
		}
		if(e.getSource()==backbutton)
		{
			String txt=displaylabel.getText();
			displaylabel.setText(txt.substring(0,txt.length()-1));
		}
		if(e.getSource()==clearbutton)
		{
			displaylabel.setText(" ");
		}
		if(e.getSource()==percentbutton)
		{
			displaylabel.setText(displaylabel.getText()+"%");
		}
		
		
	}

}
