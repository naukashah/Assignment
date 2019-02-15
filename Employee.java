package Assignment;

public class Employee {
	int empNo, zipcode,phone,experienceYears;
	String empName, address, state, designation;
	String emailAddres;
	int basic,hra, bonus;
	
	public void calcBonus(int percent) {
		bonus = (basic * percent)/100;
	}
	
	public Employee(int empNo, int zipcode, int phone, int experienceYears, String empName, String address,
			String state, String designation, String emailAddres, int basic, int hra) {
		super();
		this.empNo = empNo;
		this.zipcode = zipcode;
		this.phone = phone;
		this.experienceYears = experienceYears;
		this.empName = empName;
		this.address = address;
		this.state = state;
		this.designation = designation;
		this.emailAddres = emailAddres;
		this.basic = basic;
		this.hra = hra;
	}


	public int getEmpNo() {
		System.out.println("Employee Number : " + empNo);
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public int getZipcode() {
		System.out.println("Employee Zipcode : " + zipcode);
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public int getPhone() {
		System.out.println("Employee Phone : " + phone);
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public int getExperienceYears() {
		System.out.println("Employee ExperienceYears : " + experienceYears);
		return experienceYears;
	}


	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}


	public String getEmpName() {
		System.out.println("Employee EmpName : " + empName);
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getAddress() {
		System.out.println("Employee Address : " + address);
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		System.out.println("Employee State : " + state);
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDesignation() {
		System.out.println("Employee Designation : " + designation);
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getEmailAddres() {
		System.out.println("Employee EmailAddres : " + emailAddres);
		return emailAddres;
	}


	public void setEmailAddres(String emailAddres) {
		this.emailAddres = emailAddres;
	}


	public int getBasic() {
		System.out.println("Employee Basic : " + basic);
		return basic;
	}


	public void setBasic(int basic) {
		this.basic = basic;
	}


	public int getHra() {
		System.out.println("Employee Hra : " + hra);
		return hra;
	}


	public void setHra(int hra) {
		this.hra = hra;
	}

	public void Salary() {
		int total = basic + hra + bonus;
		System.out.println("Enployee Salary is : " + total);
	}

	public static void main(String[] args) {
		Employee empObject1 = new Employee(1, 95050, 12345, 2, "Nauka", "Santa clara", "CA", "Analyst", "naukashah@gmail.com", 1000, 50);
		empObject1.calcBonus(10);
		empObject1.Salary();
		empObject1.getEmpNo();
		empObject1.getDesignation();
		empObject1.getZipcode();
		empObject1.setHra(100);
		empObject1.Salary();

	}

}
