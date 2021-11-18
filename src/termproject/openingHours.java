package termproject;


import java.awt.Frame;



import javax.swing.JDialog;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class openingHours extends JDialog  {

	private JLabel heading = new JLabel("Opening Hours");
	private JLabel monday = new JLabel("Monday 7.30am - 9pm");
	private JLabel tuesday = new JLabel("Tuesday 7.30am - 9pm");
	private JLabel wednesday = new JLabel("Wednesday 7.30am - 9pm");
	private JLabel thursday = new JLabel("Thursday 7.30am - 9pm");
	private JLabel friday = new JLabel("Friday 7.30am - 9pm");
	private JLabel saturday = new JLabel("Saturday 7.30am - 9pm");
	private JLabel saunday = new JLabel("Sunday 7.30am - 9pm");
	private JLabel bankHoliday = new JLabel("Bank Holiday 9am - 7pm");

	
	private MainWindow parent;
	
	public openingHours(Frame owner,String title, boolean modal) {
		super(owner, title, modal);
		this.setLayout(new MigLayout());
		parent = (MainWindow)this.getParent();
		this.setLocationRelativeTo(parent);
		this.add(heading, "wrap");
		this.add(monday,"wrap");
		this.add(tuesday,"wrap");
		this.add(wednesday,"wrap");
		this.add(thursday,"wrap");
		this.add(friday," wrap");
		this.add(saturday," wrap");
		this.add(saunday," wrap");
		this.add(bankHoliday," wrap");
		this.pack();
		
		

		}

}