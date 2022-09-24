package deep_cloning;

public class Student implements Cloneable {

	int id;
	String name;
	Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student dummyStd = (Student) super.clone();
		Address add = (Address) address.clone();
		dummyStd.address = add;
		return dummyStd;
	}

}
