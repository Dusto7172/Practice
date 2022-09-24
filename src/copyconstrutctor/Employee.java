package copyconstrutctor;

public class Employee {

	int id;
	String name;
	Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(Employee emp) {
		this.id = emp.id;
		this.name = emp.name;

		Address dummy = new Address();
		dummy.city = emp.address.city;
		dummy.pincode = emp.address.pincode;
		this.address = dummy;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
