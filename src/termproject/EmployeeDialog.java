package termproject;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import net.miginfocom.swing.MigLayout;

public class EmployeeDialog extends JDialog  {

	private JLabel heading = new JLabel("Employee Registration");
	private JLabel nameLabel = new JLabel("Name");
	private JTextField textName = new JTextField(20);
	private JLabel department = new JLabel("Department");
	private JTextField departmentName = new JTextField(20);
	private JLabel email = new JLabel("Email");
	private JTextField textEmail = new JTextField(20);
	private JLabel dob = new JLabel("DOB");
	private JTextField day = new JTextField(2);
	private JTextField month = new JTextField(2);
	private JTextField year = new JTextField(4);
	private JLabel genders = new JLabel("Gender");
	private JRadioButton r1= new JRadioButton("Male");
	private JRadioButton r2= new JRadioButton("Female");
	
	
	private ButtonGroup gender = new ButtonGroup();
	private JCheckBox term = new JCheckBox("I accept terms and conditions");
	private JButton okButton  = new JButton("OK");
	private JButton cancelButton  = new JButton("Cancel");
	private MainWindow parent;
	
	public EmployeeDialog(Frame owner,String title, boolean modal) {
		super(owner, title, modal);
		this.setLayout(new MigLayout());
		parent = (MainWindow)this.getParent();
		this.setLocationRelativeTo(parent);
		this.add(nameLabel);
		this.add(textName, "wrap");
		this.add(department);
		this.add(departmentName,"wrap");
		this.add(email);
		this.add(textEmail,"wrap");
		this.add(dob);
		this.add(day,"span 1, split 3");
		this.add(month);
		this.add(year, "wrap");
		r1.setActionCommand("Male");
		r2.setActionCommand("Female");
		this.add(r1);
		this.add(r2);
		gender.add(r1);
		gender.add(r2);
		this.add(okButton, "tag ok, skip 1, split 2");
		this.add(cancelButton,"tag cancel");
		this.pack();
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EmployeeDialog.this.setVisible(false);
				
			}
		});
		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String name = textName.getText();
				ButtonModel model = gender.getSelection();
				String gender = model.getActionCommand();
				String department = departmentName.getText();
				String email = textEmail.getText();
				String dayAsString = day.getText();
				int day = Integer.parseInt(dayAsString);
				String monthAsString = month.getText();
				int month = Integer.parseInt(monthAsString);
				String yearAsString = year.getText();
				int year = Integer.parseInt(yearAsString);
				Employee newEmployees = new Employee(name,gender,department,email,day,month,year);
				parent.addEmployee(newEmployees);
				EmployeeDialog.this.setVisible(false);
				
				
				
				
				}
			});
		
		
		
		
		}

}
