package shallow_cloning;

public class TestPerson {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p1 = new Person("Dev", 22, "M");
		System.out.println("Original Copy = " + p1);

		Person p2 = (Person) p1.clone();
		System.out.println("Clone Copy = " + p2);

		System.out.println("After Changing Values");
		p2.age = 26;

		System.out.println("Original Copy = " + p1);
		System.out.println("Original Copy = " + p2);
	}

}
