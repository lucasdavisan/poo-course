package lesson11;

public class Student extends Person {
    private int registrationNumber;
    private String course;
    
    public void montlyPayment() {
        System.out.println("Pagando mensalidade do aluno: " + this.name);
    }
    
    public int getRegistrationNumber() {
        return this.registrationNumber;
    }
    
    public void setRegistrationNumber(int regNum) {
        this.registrationNumber = regNum;
    }
    
    public String getCourse() {
        return this.course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
}
