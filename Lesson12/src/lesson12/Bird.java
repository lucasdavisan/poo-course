package lesson12;
public class Bird extends Animal {
    private String featherColor;

    @Override
    public void move() {
        System.out.println("Voando.");
    }

    @Override
    public void eat() {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitSound() {
        System.out.println("Som de ave.");
    }
    
    public void nidify() {
        System.out.println("Construindo ninho.");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
