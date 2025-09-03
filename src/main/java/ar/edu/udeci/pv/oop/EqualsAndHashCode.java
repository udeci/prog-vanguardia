package ar.edu.udeci.pv.oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee{

    int id;
    String name;

    public Employee(int i, String name){
        this.id = i;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsAndHashCode {

    public static void main(String[] args){

        Employee e1 = new Employee(1, "Ana");

        Employee e2 = new Employee(1, "Ana");

        Employee e3 = new Employee(1, "Ana3");

        Map<Employee,String> map = new HashMap<>();
        map.put(e1,"Ana - Jack");
        map.put(e2,"Peter - Jack");
        map.put(e3, "Ana - Jack");


        System.out.println(" Employee 1 map =" + e1 + " hashcode : " + e1.hashCode());
        System.out.println(" Employee 2 map =" + e2 + " hashcode : "  + e2.hashCode());
        System.out.println(" Employee 3 map =" + e3 + " hashcode : "  + e3.hashCode());

        System.out.println(" Employee GET 2 map =" + map.get(e2) + " hashcode : "  + map.get(e2).hashCode());


        System.out.println(" Size map =" + map.size());

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(i1,"Jack");
        map2.put(i2,"Jack");


        System.out.println(" Integer 1 map =" + i1.hashCode());
        System.out.println(" Integer 2 map =" + i2.hashCode());

        System.out.println(" Size map2 =" + map2.size());
    }


}
