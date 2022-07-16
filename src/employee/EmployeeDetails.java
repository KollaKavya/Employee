package employee;

public class EmployeeDetails {
    public int id;
    public String name;
    public String role;
    public float salary;
    public int experience;

    public EmployeeDetails(int id, String name, String role, float salary, int experience) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.experience = experience;
    }

    public EmployeeDetails() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
