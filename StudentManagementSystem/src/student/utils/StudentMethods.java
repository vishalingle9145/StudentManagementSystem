package student.utils;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import student.core.Student;
import student.customException.InvalidInputException;

public class StudentMethods {

//	authenticate user by PRN and PASSWORD
	public static void authenticateStudent(String prn, String password, List<Student> student)
			throws InvalidInputException {
		Student s = new Student(prn);

		int index = student.indexOf(s);

		if (index != -1) {
			s = student.get(index);

			if (s.getPassword().equals(password)) {
				System.out.println("Login Successful...!");
				System.out.println("WELCOME: " + s.getEmail());
			} else {
				throw new InvalidInputException("Incorect Password!!!!");
			}
		} else {
			throw new InvalidInputException("Incorrect PRN number...!!!");
		}
	}

//	reset password
	public static void resetPassword(String prn, String password, String newPassword, List<Student> student)
			throws InvalidInputException {

		Student s = new Student(prn);

		int index = student.indexOf(s);

		if (index != -1) {
			s = student.get(index);

			if (s.getPassword().equals(password)) {
				s.setPassword(newPassword);
			} else {
				throw new InvalidInputException("Incorrect Old Password...!!!");
			}

		} else {
			throw new InvalidInputException("Incorrect PRN...!!! Try again");
		}

	}

//	remove customer
	public static void removeCustomer(String prn, List<Student> student) throws InvalidInputException {

		Student s = new Student(prn);

		int index = student.indexOf(s);

		if (index != -1) {
			s = student.get(index);

			if (s.getPrn().equals(prn)) {
				student.remove(index);
				System.out.println("User Removed: " + prn);
			}

		} else {
			throw new InvalidInputException("User not Found....!!!");
		}

	}

}
