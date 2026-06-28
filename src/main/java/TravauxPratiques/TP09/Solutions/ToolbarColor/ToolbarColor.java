package TravauxPratiques.TP09.Solutions.ToolbarColor;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;


public class ToolbarColor extends JFrame {
	private JPanel jPanel = new JPanel() ;
	private JButton buttonRed = new JButton("Red") ;
	private JButton buttonYellow = new JButton("Yellow") ;
	private JButton buttonBlue = new JButton("Blue") ;
	private JToolBar jToolBar = new JToolBar() ;
	
	public ToolbarColor()
	{
		super("Color from JToolBar") ;
		
		Button_click listener = new Button_click() ;
		
		buttonRed.setBackground(Color.RED) ;
		buttonYellow.setBackground(Color.YELLOW) ;
		buttonBlue.setBackground(Color.BLUE) ;
		buttonBlue.setForeground(Color.WHITE) ;
				
		buttonRed.addActionListener(listener) ;
		buttonYellow.addActionListener(listener) ;
		buttonBlue.addActionListener(listener) ;
		
		jPanel.setPreferredSize(new Dimension(300, 300)) ;
		
	    jToolBar.setFloatable(false);
	    jToolBar.setRollover(true);
				
		jToolBar.add(buttonRed) ;
		jToolBar.add(buttonYellow) ;
		jToolBar.add(buttonBlue) ;
		
		add(jToolBar, BorderLayout.NORTH) ;
		add(jPanel, BorderLayout.CENTER) ;
	}
	
	class Button_click implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			jPanel.setBackground( ((JButton) e.getSource()).getBackground()) ;
		}
	}
	
	public static void main(String[] args) {
		ToolbarColor tbc = new ToolbarColor() ;
		
		tbc.pack();
		
		tbc.setVisible(true) ;
	}
}
