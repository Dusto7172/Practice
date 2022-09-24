package comparable;

public class Student implements Comparable<Student> {

	int id;
	String name;
	int salary;

	public Student(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Student st) {

		if (salary == st.salary) {
			return 0;
		}

		else if (salary > st.salary) {
			return 1;
		}

		else {
			return -1;
		}
	}

}
