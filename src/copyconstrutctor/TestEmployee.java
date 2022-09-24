package copyconstrutctor;

public class TestEmployee {

	public static void main(String[] args) {

		Address add = new Address("Nerul", 400706);

		Employee e1 = new Employee(15474, "Shetu", add);
		System.out.println("Original Copy = " + e1);

		Employee e2 = new Employee(e1);
		System.out.println("Clone Copy = " + e2);

		System.out.println("After Changing Values");

		e2.address.city = "Nerul East";
		e2.name = "Rama";

		System.out.println("Original Copy =" + e1);
		System.out.println("Clone Copy =" + e2);

	}

}
