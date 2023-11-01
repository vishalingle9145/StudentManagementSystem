package student.customOrdering;

import java.util.Comparator;

import student.core.Student;

public class SortByDOB implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2)
	{
		return s1.getDob().compareTo(s2.getDob());
	}
	
}
