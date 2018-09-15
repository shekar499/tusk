package comparator;

public class Employee {

	private int id;
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name;
}
