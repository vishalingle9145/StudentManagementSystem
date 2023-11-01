package student.tester;

import student.core.Course;
import student.core.Student;
import student.customOrdering.SortByDOB;
import student.customOrdering.SortByEmail;

import static student.utils.ValidationRules.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static student.utils.SMSUtils.*;
import static student.utils.StudentMethods.*;

public class StudentTester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<Student> student = populateStudents();

			boolean exit = false;

			while (!exit) {

				System.out.println(
						"\n1. SIGN UP 2. SIGN IN 3. Change Password 4. Display All\n5. Sort By Email 6. Sort By DOB 7. Unsubscribe 8. EXIT");

				try {

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter: prn, firstName, lastName, email,password, dob, course, fees");
						Student stud = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.next(), sc.nextDouble(), student);
						student.add(stud);
						System.out.println("Student Registration successful...!");
						break;

					case 2:
						System.out.println("Enter PRN and Password");
						authenticateStudent(sc.next(), sc.next(), student);
						break;

					case 3:
						System.out.println("Enter PRN, Old Password and New Password");
						resetPassword(sc.next(), sc.next(), sc.next(), student);
						System.out.println("Password Updated...!");
						break;

					case 4:
						System.out.println("All Student Details: ");
						Iterator<Student> it = student.iterator();
						while (it.hasNext()) {
							Student s = it.next();
							System.out.println(s);
						}
						break;

					case 5:
						Collections.sort(student, new SortByEmail());
						System.out.println("Data sorted by Email...!");
						break;

					case 6:
						Collections.sort(student, new SortByDOB());
						System.out.println("Data sorted by DOB...!");
						break;

					case 7:
						System.out.println("Enter PRN to Unsubscribe");
						removeCustomer(sc.next(), student);
						break;

					case 8:
						exit = true;
						break;
					}

				} catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}

		}

	}

}
