package comparator;

import java.util.TreeSet;

public class TestSalarySorting {
	
	public static void main(String[] args) {
		
		SortingBySal sort = new SortingBySal();
		
		TreeSet<Employee> treeset = new TreeSet<Employee>(sort);
		
		treeset.add(new Employee(145,"Sinu",25000));
		treeset.add(new Employee(123,"Shaam",20000));
		treeset.add(new Employee(189,"Ramu",22000));
		treeset.add(new Employee(142,"Sita",15000));
		treeset.add(new Employee(172,"Yogita",18000));
		
		System.out.println(treeset);
	}

}
