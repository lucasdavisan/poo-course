package lesson11;
public class Teacher extends Person {
    private String speciality;
    private float salary;
    
    public void receiveRaise() {
        this.setSalary(this.getSalary() + 1);
    }
    
    public String getSpeciality() {
        return this.speciality;
    }
    
    public void setSpeciality(String s) {
        this.speciality = s;
    }
    
    public float getSalary() {
        return this.salary;
    }
    
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "speciality=" + speciality + ", salary=" + salary + '}';
    }
}
