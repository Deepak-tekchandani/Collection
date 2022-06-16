package hash_set_example;

import java.util.HashSet;
import java.util.Set;

public class Student_Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student>  students = new HashSet<Student>();
		
		students.add(new Student("Deepak",32));
		students.add(new Student("Pawan",44));
		students.add(new Student("Kelash",34));
		students.add(new Student("Imran",18));
		students.add(new Student("Deepak",32));
		
		Student s1 = new Student("Deepak", 32);
		Student s2 = new Student("Pawan", 32);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(students);

	}

}
