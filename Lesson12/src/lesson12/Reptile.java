package lesson12;
public class Reptile extends Animal {
    private String scaleColor;

    @Override
    public void move() {
        System.out.println("Rastejando-se.");
    }

    @Override
    public void eat() {
        System.out.println("Comendo vegetais/insetos.");
    }

    @Override
    public void emitSound() {
        System.out.println("Emitindo som de réptil.");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
