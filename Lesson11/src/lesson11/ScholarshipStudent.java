package lesson11;
public class ScholarshipStudent extends Student {
    private float scholarship;
    
    public void renewScholarship() {
        System.out.println("Renovando bolsa de: " + this.name);
    }
    
    @Override
    public void montlyPayment() {
        System.out.println(this.name + " é bolsista! Pagamento facilitado!");
    }

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }
}
