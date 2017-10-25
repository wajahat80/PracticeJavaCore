import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestComparable  {
	public static void main(String args[]){
		
		TestComparable test=new TestComparable();
	
		List<Employee> le = new ArrayList<Employee>();
		le.add(new Employee(2, "Jawwad", 32));
		le.add(new Employee(1, "Raja", 36));
		le.add(new Employee(4, "Wajeeha", 22));
		le.add(new Employee(3, "Saad", 28));
		
		System.out.println("... Before Sorting ...");
		test.printList(le);		
		
		
		System.out.println("... After Sorting - Default...");
		Collections.sort(le);
		test.printList(le);		
		
		
		// Now Sorting on the basis of Age
		System.out.println("... After Sorting by age ...");
		Collections.sort(le, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.empAge>o2.empAge)	return 11;
				if(o1.empAge<o2.empAge)	return -1;
				return 0;
			}
			
		});
		
		test.printList(le);
		
		// Using Java 8
		Collections.sort(le,(p1, p2) -> p1.empName.compareTo(p2.empName));
		Collections.sort(le,(p1, p2) -> {
											if(p1.empAge>p2.empAge) return 0;
											else return -1;
										});
		
		System.out.println("Using Java 8 Sorting");
		le.stream().sorted().forEach(x->System.out.println(x.empName));

		
		System.out.println("List to Array");
		Employee[] empArr = convertListToArray(le);
		System.out.println(empArr[0].empAge);
	}
	
	public void printList(List<Employee> le){
		for (Employee employee : le) {
			System.out.println(employee.empName);
		}
	}

	public static Employee[] convertListToArray(List<Employee> lst){
		
		Employee[] empArr = new Employee[lst.size()];
		empArr = lst.toArray(empArr);
		return empArr;		
		
	}
	
}

class Employee implements Comparable<Employee>{
	
	long empId = 0L;
	String empName ="";
	int empAge = 0;
	
	Employee(long id, String empName, int empAge){
		this.empId=id;
		this.empName = empName;
		this.empAge=empAge;
	}

	/*@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.empAge>arg1.empAge) return 1;
		if(arg0.empAge<arg1.empAge) return 0;
		return 0;
	}*/

	@Override
	public int compareTo(Employee arg0) {
		if(this.empAge>arg0.empAge) return -1;
		if(this.empAge<arg0.empAge) return 1;
		return 0;
	}
	
	
}