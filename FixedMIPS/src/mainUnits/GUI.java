package mainUnits;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import mainUnits.Simulator;

@SuppressWarnings("serial")

public class GUI extends JFrame implements MouseListener, ActionListener{
	private boolean openfile1 = false;
	private String filename;
	private JFrame window;
	private JButton run;
	private JButton openFile;
	public GUI() {
		init();
	}
	public void init()
	{
		JFrame window= new JFrame();
		window.getContentPane().setLayout(new BorderLayout());
		window.setTitle(" MIPS Simulator");
		JPanel buttonPanel = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel SimulatorPanel = new JPanel();
		SimulatorPanel.setBackground(Color.WHITE);
		SimulatorPanel.setLayout(new GridLayout(0,2));
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setLayout(new FlowLayout());
		window.setSize(1000, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea textarea = new JTextArea(50,80);
		JButton openFile=new JButton("Open file");
		openFile.setBackground(Color.red);
		openFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					openfile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Simulatorpanel( SimulatorPanel );
		buttonPanel.add(openFile);
		textPanel.add(textarea);
		openFile.setBounds(100, 100, 200, 200);
		window.getContentPane().add(buttonPanel, BorderLayout.NORTH);
		window.getContentPane().add(textPanel, BorderLayout.WEST);
		window.getContentPane().add(SimulatorPanel, BorderLayout.EAST);
		window.setVisible(true);
	}
	
	
	public void openfile() throws IOException
	{
		final JFileChooser fc = new JFileChooser();
		int response = fc.showOpenDialog(GUI.this);
		if(response == JFileChooser.APPROVE_OPTION){
			 this.filename = fc.getSelectedFile().toString();
			 this.openfile1 = true;
		}else{
			this.openfile1 = false;
			this.filename = "";
		}
		
	} 
		
	public void Simulatorpanel(JPanel SimulatorPanel ){
		//JLabel pc = new JLabel ("pc:");
		//JLabel pcvalue = new JLabel (String.valueOf(getPC()));
		JLabel t0label = new JLabel ("to:");
		JLabel t0valuelabel = new JLabel (String.valueOf(RegisterFile.getT0()));
		JLabel t1label = new JLabel ("t1:");
		JLabel t1valuelabel = new JLabel (String.valueOf(RegisterFile.getT1()));
		JLabel t2label = new JLabel ("t2:");
		JLabel t2valuelabel = new JLabel (String.valueOf(RegisterFile.getT2()));
		JLabel t3label = new JLabel ("t3:");
		JLabel t3valuelabel = new JLabel (String.valueOf(RegisterFile.getT3()));
		JLabel t4label = new JLabel ("t4:");
		JLabel t4valuelabel = new JLabel (String.valueOf(RegisterFile.getT4()));
		JLabel t5label = new JLabel ("t5:");
		JLabel t5valuelabel = new JLabel (String.valueOf(RegisterFile.getT5()));
		JLabel t6label = new JLabel ("t6:");
		JLabel t6valuelabel = new JLabel (String.valueOf(RegisterFile.getT6()));
		JLabel t7label = new JLabel ("t7:");
		JLabel t7valuelabel = new JLabel (String.valueOf(RegisterFile.getT7()));
		JLabel s0label = new JLabel ("s0:");
		JLabel s0valuelabel = new JLabel (String.valueOf(RegisterFile.getS0()));
		JLabel s1label = new JLabel ("s1:");
		JLabel s1valuelabel = new JLabel (String.valueOf(RegisterFile.getS1()));
		JLabel s2label = new JLabel ("s2:");
		JLabel s2valuelabel = new JLabel (String.valueOf(RegisterFile.getS2()));
		JLabel s3label = new JLabel ("s3:");
		JLabel s3valuelabel = new JLabel (String.valueOf(RegisterFile.getS3()));
		JLabel s4label = new JLabel ("s4:");
		JLabel s4valuelabel = new JLabel (String.valueOf(RegisterFile.getS4()));
		JLabel s5label = new JLabel ("s5:");
		JLabel s5valuelabel = new JLabel (String.valueOf(RegisterFile.getS5()));
		JLabel s6label = new JLabel ("s6:");
		JLabel s6valuelabel = new JLabel (String.valueOf(RegisterFile.getS6()));
		JLabel s7label = new JLabel ("s7:");
		JLabel s7valuelabel = new JLabel (String.valueOf(RegisterFile.getS7()));
		JLabel atlabel = new JLabel ("at:");
		JLabel atvaluelabel = new JLabel (String.valueOf(RegisterFile.getAt()));
		JLabel a0label = new JLabel ("a0:");
		JLabel a0valuelabel = new JLabel (String.valueOf(RegisterFile.getA0()));
		JLabel a1label = new JLabel ("a1:");
		JLabel a1valuelabel = new JLabel (String.valueOf(RegisterFile.getA1()));
		JLabel a2label = new JLabel ("a2:");
		JLabel a2valuelabel = new JLabel (String.valueOf(RegisterFile.getA2()));
		JLabel a3label = new JLabel ("a3:");
		JLabel a3valuelabel = new JLabel (String.valueOf(RegisterFile.getA3()));
		JLabel v0label = new JLabel ("v0:");
		JLabel v0valuelabel = new JLabel (String.valueOf(RegisterFile.getV0()));
		JLabel v1label = new JLabel ("v1:");
		JLabel v1valuelabel = new JLabel (String.valueOf(RegisterFile.getV1()));
		JLabel k0label = new JLabel ("k0:");
		JLabel k0valuelabel = new JLabel (String.valueOf(RegisterFile.getK0()));
		JLabel k1label = new JLabel ("k1:");
		JLabel k1valuelabel = new JLabel (String.valueOf(RegisterFile.getK1()));
		//SimulatorPanel.add(pc);
		//SimulatorPanel.add(pcvalue);
		SimulatorPanel.add(t0label);
		SimulatorPanel.add(t0valuelabel);
		SimulatorPanel.add(t1label);
		SimulatorPanel.add(t1valuelabel);
		SimulatorPanel.add(t2label);
		SimulatorPanel.add(t2valuelabel);
		SimulatorPanel.add(t3label);
		SimulatorPanel.add(t3valuelabel);
		SimulatorPanel.add(t4label);
		SimulatorPanel.add(t4valuelabel);
		SimulatorPanel.add(t5label);
		SimulatorPanel.add(t5valuelabel);
		SimulatorPanel.add(t6label);
		SimulatorPanel.add(t6valuelabel);
		SimulatorPanel.add(t7label);
		SimulatorPanel.add(t7valuelabel);
		SimulatorPanel.add(s0label);
		SimulatorPanel.add(s0valuelabel);
		SimulatorPanel.add(s1label);
		SimulatorPanel.add(s1valuelabel);
		SimulatorPanel.add(s2label);
		SimulatorPanel.add(s2valuelabel);
		SimulatorPanel.add(s3label);
		SimulatorPanel.add(s3valuelabel);
		SimulatorPanel.add(s4label);
		SimulatorPanel.add(s4valuelabel);
		SimulatorPanel.add(s5label);
		SimulatorPanel.add(s5valuelabel);
		SimulatorPanel.add(s6label);
		SimulatorPanel.add(s6valuelabel);
		SimulatorPanel.add(s7label);
		SimulatorPanel.add(s7valuelabel);
		SimulatorPanel.add(atlabel);
		SimulatorPanel.add(atvaluelabel);
		SimulatorPanel.add(atlabel);
		SimulatorPanel.add(atvaluelabel);
		SimulatorPanel.add(a0label);
		SimulatorPanel.add(a0valuelabel);
		SimulatorPanel.add(a1label);
		SimulatorPanel.add(a1valuelabel);
		SimulatorPanel.add(a2label);
		SimulatorPanel.add(a2valuelabel);
		SimulatorPanel.add(a3label);
		SimulatorPanel.add(a3valuelabel);
		SimulatorPanel.add(k0label);
		SimulatorPanel.add(k0valuelabel);
		SimulatorPanel.add(k1label);
		SimulatorPanel.add(k1valuelabel);
		SimulatorPanel.add(v0label);
		SimulatorPanel.add(v0valuelabel);
		SimulatorPanel.add(v1label);
		SimulatorPanel.add(v1valuelabel);
	}

	public static void main (String[]args) throws IOException
	{
		try {
		GUI w = new GUI();
		while(true){
			System.out.print(w.openfile1);
			if(w.openfile1){
				System.out.print("A&A");
				new Simulator(w.filename);
				System.out.println(RegisterFile.getT0());
				System.out.println(RegisterFile.getT1());
				System.out.println(RegisterFile.getT2());
			}
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
