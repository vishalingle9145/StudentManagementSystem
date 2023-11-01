package student.utils;

import java.time.LocalDate;
import java.util.List;


import student.core.Course;
import student.core.Student;
import student.customException.InvalidInputException;

public class ValidationRules {

//	validate date
	public static LocalDate parseAndValidateDOB(String dob) throws InvalidInputException {
		LocalDate date = LocalDate.parse(dob);

		LocalDate checkDate = LocalDate.of(1985, 1, 1);

		if (date.isBefore(checkDate)) {
			throw new InvalidInputException("DOB must be after 1st Jan 1985 ");
		}
		return date;
	}

//	validate course
	public static Course parseAndValidateCourse(String course) throws InvalidInputException {
		return Course.valueOf(course.toUpperCase());
	}
	
//	validate course fees
	public static void validateCourseFees(Course course, double fees)throws InvalidInputException
	{
		if(course.getFees()!=fees)
		{
			throw new InvalidInputException("Please enter valid Fees!!");
		}
	}

	public static void checkForDuplicate(String prn, List<Student> student) throws InvalidInputException {
		Student s = new Student(prn);

		if (student.equals(s)) {
			throw new InvalidInputException("Duplicate PRN Number....!");
		}
	}
	
	
	
//	Email validation
	public static void validateEmail(String email, List<Student> custList) throws InvalidInputException
	{
		//regex
		String pattern = "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
		if(!email.matches(pattern))
			throw new InvalidInputException("Invalid Email...Try again!!!");
	}

	
//	all validation
	public static Student validateAllInputs(String prn, String firstName, String lastName, String email,
			String password, String dob, String course, double fees, List<Student> student) throws InvalidInputException {
	
		LocalDate d = parseAndValidateDOB(dob);
		Course c = parseAndValidateCourse(course);
		checkForDuplicate(prn, student);
		validateEmail(email, student);
		validateCourseFees(c, fees);

		return new Student(prn, firstName, lastName, email, password, d, c, fees);

	}

}
