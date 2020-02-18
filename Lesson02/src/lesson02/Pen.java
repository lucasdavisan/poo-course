package lesson02;
public class Pen {
    String model;
    String color;
    float point;
    int charge;
    boolean covered;
    
    void status() {
        System.out.println("Um modelo: " + this.model);
        System.out.println("Uma caneta: " + this.color);
        System.out.println("Ponta: " + this.point);
        System.out.println("Carga: " + this.charge);
        System.out.println("Está tampada? " + this.covered);
    }
    
    void scribble() {
        if(this.covered == true){
            System.out.println("Erro! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    void cover() {
        this.covered = true;
    }
    
    void uncover() {
        this.covered = false;
    }
}
