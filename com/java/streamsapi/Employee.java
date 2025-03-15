package streamsapi;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String department;
    private int  age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT",35),
                new Employee("Jane", "HR",24),
                new Employee("Mark", "IT",43),
                new Employee("Bob", "Finance",35),
                new Employee("Alice", "IT",33),
                new Employee("Eve", "HR",50)
        );

        employees.stream().mapToInt(Employee::getAge).average();
        //write java 8 program for find which department has max employees
        TreeMap<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()))
                ;
        Optional<Map.Entry<String, Long>> optional = collect.entrySet()
                .stream().max(Map.Entry.comparingByValue());

        String result = optional.get().getKey() + " -> " + optional.get().getValue();

        System.out.println(result);

    }
}


