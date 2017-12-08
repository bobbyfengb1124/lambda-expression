import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.sound.midi.Soundbank;

/**
 * author: Feng Bo
 *
 * date: Dec 8, 2017
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new Thread(()-> {
			System.out.println("Printing from the Runnable");
			System.out.println("Line 2");
			System.out.format("This is line %d\n", 3);
		}).start();
		
		Employee john = new Employee("John Doe", 30);
		Employee tim = new Employee("Tim Buchalka", 21);
		Employee jack = new Employee("Jack Hill", 40);
		Employee snow = new Employee("Snow White", 22);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(john);
		employees.add(tim);
		employees.add(jack);
		employees.add(snow);
		
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}

}

class Employee {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class CodeToRun implements Runnable {

	@Override
	public void run() {
		System.out.println("Printing from the Runnable");
		
	}
	
}
