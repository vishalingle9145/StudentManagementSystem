package student.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import student.core.Course;
import student.core.Student;

public class SMSUtils {
	
	public static List<Student> populateStudents()
	{
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("12345F", "Vishal", "Ingle", "vishal@gmail.com", "vishal@123", LocalDate.parse("1999-09-19"), Course.PGDAC, 95000));
		students.add(new Student("12344A", "Ajay", "Ingle", "ajay@gmail.com", "ajay@123", LocalDate.parse("1999-09-15"), Course.DITISS, 85000));
		students.add(new Student("12343E", "Mauli", "Bagal", "mauli@gmail.com", "mauli@123", LocalDate.parse("1998-11-07"), Course.DBDA, 90000));
		
		return students;
		
	}

}
