package lesson12;
public class Lesson12 {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        Kangoroo k = new Kangoroo();
        Dog d = new Dog();
        
        System.out.println("===================");
        m.setWeight(5.70f);
        m.setAge(8);
        m.setMembers(4);
        m.move();
        m.eat();
        m.emitSound();
        System.out.println("===================");
        k.setWeight(55.30f);
        k.setAge(3);
        k.setMembers(4);
        k.move();
        k.eat();
        k.emitSound();
        k.useBag();
        System.out.println("===================");
        d.setWeight(3.94f);
        d.setAge(5);
        d.setPelageColor("Marrom");
        d.setMembers(4);
        d.move();
        d.eat();
        d.emitSound();
        d.wagTail();
        System.out.println("===================");
    }
}
