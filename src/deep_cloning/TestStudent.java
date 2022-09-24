package deep_cloning;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address add = new Address("Nerul", 400706);

		Student s1 = new Student(20, "Rama", add);
		System.out.println("Original Copy =" + s1);

		Student s2 = (Student) s1.clone();
		System.out.println("Clone Copy =" + s2);

		System.out.println("After Changing Values");

		s2.address.city = "Nerul East";
		s2.name = "Ravi";

		System.out.println("Original Copy =" + s1);
		System.out.println("Clone Copy =" + s2);

	}

}
