package MySelf.Gun34Odev.Soru2;

public class Employess {
    private String name;
    private  int salary;
    private String dob;
    int tarih=2022;

    public int ageCalculator(int yas){return tarih-yas;}
    public Employess(String name, int salary, String dob) {
        setName(name);
        setSalary(salary);
        setDob(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employess{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob='" + dob + '\'' +
                '}';
    }
}
