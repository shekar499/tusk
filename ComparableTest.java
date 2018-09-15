public class ComparableTest implements Comparable<Employee>  {
public int compareTo(Employee e){
return this.id-e.id;
}

}
