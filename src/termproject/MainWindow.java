package termproject;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class MainWindow extends JFrame implements ActionListener{
	
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu employeeMenu = new JMenu("Employees");
	private JMenu contactMenu = new JMenu("Contact Information");
	private JMenu openingHours = new JMenu("Opening Hours");
	private JMenuItem createEmployeeItem = new JMenuItem("Create Employee");
	private JMenuItem contactMenuItem = new JMenuItem("Contact Information");	
	private JMenuItem openingHoursItem = new JMenuItem("View Opening Hours");
	private List<Employee> employees = new ArrayList<>();
	private EmployeeTableModel tableModel = new EmployeeTableModel(employees);
	private JTable employeeTable = new JTable(tableModel);
	private JScrollPane scrollPane = new JScrollPane(employeeTable);
	private ImageIcon image1;
	private JLabel label1;
	
	private static	JLabel userLabel;
	private static JTextField userText;
	private static JLabel success;
	private static	JLabel passwordLabel;
	private static	JPasswordField passwordText;
	private static	JButton button;

	public static void LoginSystem() {
		
        Scanner scan = new Scanner(System.in);
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
			frame.setSize(350,250);
			frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.add(panel);
			frame.setLocationRelativeTo(null);
			panel.setLayout(null);
			
			
			userLabel = new JLabel("User");
			userLabel.setBounds(10,20,80,25);
			panel.add(userLabel);
			
			userText = new JTextField(20);
			userText.setBounds(100,20,165,25);
			panel.add(userText);
			
			passwordLabel = new JLabel("password");
			passwordLabel.setBounds(10,50,80,25);
			panel.add(passwordLabel);
			
			passwordText = new JPasswordField();
			passwordText.setBounds(100,50,165,25);
			panel.add(passwordText);
			
			JLabel success = new JLabel("");
			success.setBounds(10,110,300,25);
			panel.add(success);
			
			button = new JButton("Login");
			button.setBounds(10,80,80,25);
			button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String user = userText.getText();
						String password = passwordText.getText();
						
						
						if(user.equals("Supervalu") && password.equals("brian")) {
							success.setText("Login succesful");
							MainWindow window = new MainWindow("Supervalu");
							window.pack();
							window.setLocationRelativeTo(null);
							window.setVisible(true);
							frame.setVisible(false);
						}
						else 
							{
							success.setText("Login unsuccesful");
							success.setForeground(Color.RED);
							}
					}
			});
			panel.add(button);
			frame.setVisible(true);		
	}
			
	public MainWindow(String title) {
		super(title);
		this.setLayout(new MigLayout("insets 15 30 30 30"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		image1 = new ImageIcon(getClass().getResource("/download.png"));
		label1 = new JLabel(image1);
		add(label1,"wrap"); 

		employees.add(new Employee("Brian Parlon","Male","FLOOR","b.parlon@gmail.com", 12,05,2000));

	
		this.setJMenuBar(menuBar);
		menuBar.add(employeeMenu); 
		menuBar.add(contactMenu);
		menuBar.add(openingHours);
		employeeMenu.add(createEmployeeItem);
		employeeMenu.add(createEmployeeItem);
		contactMenu.add(contactMenuItem);
		openingHours.add(openingHoursItem);
		
		openingHoursItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				openingHours dialog3 = new openingHours(MainWindow.this,"Contact Information", true);
				dialog3.setVisible(true);
			}
			
		});
		
		contactMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ContactInformation dialog2= new ContactInformation(MainWindow.this,"Contact Information", true);
				dialog2.setVisible(true);
			}
			
		});
		
	
		createEmployeeItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				EmployeeDialog dialog = new EmployeeDialog(MainWindow.this,"New Employee", true);
				dialog.setVisible(true);
				
			}});
		this.add(scrollPane);
	}
	public void addEmployee(Employee employee) {
	
		employees.add(employee);
		//System.out.println("There are now "+ employees.size() + " employees");
		tableModel.fireTableDataChanged();
	}
	
	

	public static void main(String[] args) {
		String systemLookAndFeelClassName = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(systemLookAndFeelClassName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		LoginSystem();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}



	

		
	
