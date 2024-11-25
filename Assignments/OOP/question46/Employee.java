package Assignments.OOP.question46;

public class Employee {
    private int id;
    private String name;
    private int sal;

    protected Employee() {

    }

    protected Employee(int id, String name, int sal) {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getSal() {
        return sal;
    }

    protected void setSal(int sal) {
        this.sal = sal;
    }
}
