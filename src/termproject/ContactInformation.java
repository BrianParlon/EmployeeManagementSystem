package termproject;

import java.awt.Desktop;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;
import net.miginfocom.swing.MigLayout;

public class ContactInformation extends JDialog  {

	private JLabel heading = new JLabel("Contact Us");
	private JLabel email = new JLabel("Email: help@realrewards.ie");
    private JLabel link	= new JLabel("Link to SuperValu website");
    private JLabel instagram = new JLabel("Link to Instagram page");
	private JLabel phoneNumber = new JLabel("Tel: 0505 21736");
	private JButton websiteLink  = new JButton("Link");
	private JButton instaLink = new JButton("Link");

	
	private MainWindow parent;
	
	public ContactInformation(Frame owner,String title, boolean modal) {
		super(owner, title, modal);
		this.setLayout(new MigLayout());
		parent = (MainWindow)this.getParent();
		this.setLocationRelativeTo(parent);
		this.add(heading, "wrap");
		this.add(email,"wrap");
		this.add(instagram);
		this.add(instaLink,"wrap");
		instaLink.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
				    Desktop.getDesktop().browse(new URL("https://www.instagram.com/berniessupervalu/?hl=en").toURI());
				} catch (Exception e1) {}
			}
		});
		
		
		this.add(link);
		this.add(websiteLink,"wrap");
		websiteLink.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				    Desktop.getDesktop().browse(new URL("http://www.supervalu.ie").toURI());
				} catch (Exception e1) {}
			
			}
			
		});
		this.add(phoneNumber,"wrap");
		this.pack();
		
		

		}

}