package student.core;

import java.time.LocalDate;

public class Student implements Comparable<Student> {

	private String prn;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate dob;
	private Course course;
	private double fees;
	private boolean confirm_admission = false;

	public Student(String prn, String firstName, String lastName, String email, String password, LocalDate dob,
			Course course, double fees) {
		super();
		this.prn = prn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.course = course;
		this.fees = fees;
		this.confirm_admission = true;

	}

	public Student(String prn) {
		super();
		this.prn = prn;
	}

	public String getPrn() {
		return prn;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public boolean isConfirm_admission() {
		return confirm_admission;
	}

	public void setConfirm_admission(boolean confirm_admission) {
		this.confirm_admission = confirm_admission;
	}

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", course=" + course + ", fees=" + fees
				+ ", confirm_admission=" + confirm_admission + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Student) {
			return this.prn.equals(((Student) o).prn);
		}

		return false;

	}

	@Override
	public int compareTo(Student s) {
		return this.prn.compareTo(s.prn);
	}

}
