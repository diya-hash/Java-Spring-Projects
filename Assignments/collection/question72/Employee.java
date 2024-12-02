package Assignments.collection.question72;

public class Employee implements Comparable {
    private int id;
    private String name;
    private int sal;

    public Employee() {

    }

    public Employee(int id, String name, int sal) {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        if (this.getSal() > e.getSal()) {
            return -1;
        }
        if (this.getSal() < e.getSal()) {
            return 1;
        }
        return 0;

    }
}
