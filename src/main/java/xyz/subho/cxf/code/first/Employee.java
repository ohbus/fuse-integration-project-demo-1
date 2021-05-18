package xyz.subho.cxf.code.first;

import java.util.Objects;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastname;
	private String gender;
	private String department;
	
	/**
	 * Default Construtor
	 */
	public Employee() {
		this.employeeId = 0;
		this.firstName = "";
		this.lastname = "";
		this.gender = "";
		this.department = "";
	}
	
	/**
	 * @param employeeId
	 * @param firstName
	 * @param lastname
	 * @param gender
	 * @param department
	 */
	public Employee(int employeeId, String firstName, String lastname, String gender, String department) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.gender = gender;
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, employeeId, firstName, gender, lastname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && employeeId == other.employeeId
				&& Objects.equals(firstName, other.firstName) && Objects.equals(gender, other.gender)
				&& Objects.equals(lastname, other.lastname);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastname=" + lastname
				+ ", gender=" + gender + ", department=" + department + "]";
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
