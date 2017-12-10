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

		// // new Thread(() -> {
		// // System.out.println("Printing from the Runnable");
		// // System.out.println("Line 2");
		// // System.out.format("This is line %d\n", 3);
		// // }).start();
		//
		// Employee john = new Employee("John Doe", 30);
		// Employee tim = new Employee("Tim Buchalka", 21);
		// Employee jack = new Employee("Jack Hill", 40);
		// Employee snow = new Employee("Snow White", 22);
		//
		// List<Employee> employees = new ArrayList<>();
		// employees.add(john);
		// employees.add(tim);
		// employees.add(jack);
		// employees.add(snow);
		//
		// // Collections.sort(employees, new Comparator<Employee>() {
		// // @Override
		// // public int compare(Employee o1, Employee o2) {
		// // return o1.getName().compareTo(o2.getName());
		// // }
		// // });
		//
		// Collections.sort(employees,
		// (Employee employee1, Employee employee2) ->
		// employee1.getName().compareTo(employee2.getName()));
		//
		// for (Employee employee : employees) {
		// System.out.println(employee.getName());
		// }
		//
		// // String sillyString = doStringStuff(new UpperConcat() {
		// //
		// // @Override
		// // public String upperAndConcat(String s1, String s2) {
		// // return s1.toUpperCase() + s2.toUpperCase();
		// // }
		// // }, employees.get(0).getName(), employees.get(1).getName());
		// // System.out.println(sillyString);
		//
		// UpperConcat uc = (s1, s2) -> {
		// String result = s1.toUpperCase() + s2.toUpperCase();
		// return result;
		// };
		// String sillyString = doStringStuff(uc,
		// employees.get(0).getName(), employees.get(1).getName());
		// System.out.println(sillyString);

		AnotherClass anotherClass = new AnotherClass();
		String s = anotherClass.doSomething();
		System.out.println(s);
	}

	public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
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
	 * @param name
	 *            the name to set
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
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}

interface UpperConcat {
	public String upperAndConcat(String s1, String s2);
}

class CodeToRun implements Runnable {

	@Override
	public void run() {
		System.out.println("Printing from the Runnable");

	}

}

class AnotherClass {

	public String doSomething() {
		int i = 0;
		UpperConcat uc = (s1, s2) -> {
			System.out.println("The Lambda expression's class is: " + getClass().getSimpleName());
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;
		};
		System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());

		return Main.doStringStuff(uc, "String1", "String2");


	}
}
