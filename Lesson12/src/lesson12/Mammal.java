package lesson12;
public class Mammal extends Animal {
    private String pelageColor;

    @Override
    public void move() {
        System.out.println("Correndo.");
    }

    @Override
    public void eat() {
        System.out.println("Alimentando-se.");
    }

    @Override
    public void emitSound() {
        System.out.println("Som de mamífero.");
    }

    public String getPelageColor() {
        return pelageColor;
    }

    public void setPelageColor(String pelageColor) {
        this.pelageColor = pelageColor;
    }
}
