package ar.edu.udeci.pv.collections.sorting;

public class Employee {
    private String name;
    private String jobTitle;
    private int age;
    private int salary;

    public Employee(String name, String jobTitle, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    // getters and setters

    public String toString() {
        return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
    }
}