package tr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 {

	public static void main(String[] args) {
		
		List <Student> list = new ArrayList<> ();
		
		list.add(new Student(10,45));
		list.add(new Student(11,345));
		list.add(new Student(12,13));
		list.add(new Student(13,46));
		
		/*Collections.sort(list, (s1,s2) -> {
			return s1.marks>s2.marks?1:-1;
		});*/
		
		Collections.sort(list);
		
		for (Student i : list ) {
			System.out.println(i);
		}
		
		
		

	}

}


class Student implements Comparable<Student> {
	
	public int rollno;
	public int marks ;
	
	public Student (int rollno, int marks) {
		
		this.rollno = rollno;
		this.marks = marks;
		
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	public int compareTo(Student s) {
		
		return this.marks>s.marks ? 1 : -1;
		
	}
}