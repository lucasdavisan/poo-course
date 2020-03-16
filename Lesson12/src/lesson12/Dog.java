package lesson12;
public class Dog extends Mammal {
    public void buryBone() {
        System.out.println("Enterrando osso.");
    }
    
    public void wagTail() {
        System.out.println("Abanando o rabo.");
    }
    
    @Override
    public void emitSound() {
        System.out.println("AU AU AU AU!");
    }
}
