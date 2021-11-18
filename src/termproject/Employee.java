package termproject;

public class Employee {
	
	private String name;
	private String gender; 
	private String department;
	private String email;
	private int day;
	private int month;
	private int year;
	
	
	public Employee(String name,String gender, String department, String email, int day,int month,int year) {
		super();
		this.name = name;
		this.setGender(gender);
		this.setDepartment(department);
		this.email = email;
		this.day = day;
		this.setMonth(month);
		this.setYear(year);
		
		
//name
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//email
	public String getEmail() {
		return email;
	}
	public void setAddress(String email) {
		this.email = email;
	}
	//day
	public int getday() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	//month
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	//year
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
