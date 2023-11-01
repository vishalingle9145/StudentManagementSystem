package student.customOrdering;

import java.util.Comparator;

import student.core.Student;

public class SortByEmail implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getEmail().compareTo(s2.getEmail());
	}

}

