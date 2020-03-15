package lesson10;

public class Teacher extends Person {
    private String speciality;
    private float salary;
    
    public void receiveSalaryIncrease(float i) {
        this.salary += i;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
