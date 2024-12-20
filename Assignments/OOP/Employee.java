package Assignments.OOP;

public class Employee {
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

    public String toString() {
        return getId() + "\t" + getName() + "\t" + getSal();
    }

    public boolean equals(Object obj) {
        Employee e2 = (Employee) obj;

        if (this.getId() == e2.getId() && this.getName() == e2.getName() && this.getSal() == e2.getSal()) {
            return true;
        } else {
            return false;
        }
    }
}
