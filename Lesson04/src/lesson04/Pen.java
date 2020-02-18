package lesson04;
public class Pen {
    private String model;
    private float point;
    private boolean covered;
    private String color;
    
    // This is the constructor method.
    public Pen(String m, String c, float p) {
        this.model = m;
        this.color = c;
        this.point = p; 
        this.cover();
    }
    
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String m) {
        this.model = m;
    }
    
    public float getPoint() {
        return this.point;
    }
    
    public void setPoint(float p) {
        this.point = p;
    }
    
    public void cover() {
        this.covered = true;
    }
    
    public void uncover() {
        this.covered = false;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModel());
        System.out.println("Ponta: " + this.getPoint());
        System.out.println("Cor: " + this.color);
        System.out.println("Tampada: " + this.covered);
    }
}
