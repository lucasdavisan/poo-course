package lesson03;

public class Pen {
    public String model;
    public String color;
    private float point;
    protected int charge;
    private boolean covered;

    public void status() {
        System.out.println("Um modelo: " + this.model);
        System.out.println("Uma caneta: " + this.color);
        System.out.println("Ponta: " + this.point);
        System.out.println("Carga: " + this.charge);
        System.out.println("Está tampada? " + this.covered);
    }

    public void scribble() {
        if(this.covered == true){
            System.out.println("Erro! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void cover() {
        this.covered = true;
    }

    public void uncover() {
        this.covered = false;
    }
}

