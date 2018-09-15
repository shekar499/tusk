package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"shekar1");
		Employee e2=new Employee(5,"shekar5");
		Employee e3=new Employee(3,"shekar3");
		Employee e4=new Employee(4,"shekar4");
		Employee e5=new Employee(2,"shekar2");
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		System.out.println("before sort"+employees);
		Collections.sort(employees,new AgeComparator());
		System.out.println("after sort :"+employees);
		
		
	}

}
