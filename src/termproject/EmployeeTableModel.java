package termproject;


import java.util.List;

import javax.swing.table.AbstractTableModel;

public class EmployeeTableModel extends AbstractTableModel {
	
	private List<Employee> employees;
	private String[] columnNames= {"Name", "Gender","email","Department","DOB:day","DOB:month","DOB:year"};
	
	
	public EmployeeTableModel(List<Employee> employee) {
		
		this.employees = employee;
	}
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}
	@Override
	public int getRowCount() {
		return employees.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Employee employee = employees.get(rowIndex);
		String result = null;
		switch(columnIndex) {
		case 0:
			result = employee.getName();
			break;
		case 1:
			result = employee.getGender();
			break;
		case 2:
			result = employee.getEmail();
			break;
		case 3:
			result = employee.getDepartment();
			
			break;
		case 4:
			result = Integer.toString(employee.getday());
			break;
		case 5:
			result = Integer.toString(employee.getMonth());
			break;
		case 6:
			result = Integer.toString(employee.getYear());
			break;
		
		
		}
		return result;
	}

}
