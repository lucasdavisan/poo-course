package lesson12;
public class Fish extends Animal {
    private String scaleColor;

    @Override
    public void move() {
        System.out.println("Nadando.");
    }

    @Override
    public void eat() {
        System.out.println("Comendo substâncias.");
    }

    @Override
    public void emitSound() {
        System.out.println("Peixe não faz som.");
    }
    
    public void toMakeBubbles() {
        System.out.println("Soltando bolhas.");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
