package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(14,"Deva",19000));
		al.add(new Student(10,"Megha",14000));
		al.add(new Student(18,"Sita",15000));
		al.add(new Student(8,"Reva",20000));
		al.add(new Student(5,"Deva",12000));
		
		Collections.sort(al);
		
		for(Student s:al)
		{
			System.out.println("Id = "+s.id+", Name = "+s.name+", Salary = "+s.salary);
		}		
	}

}
