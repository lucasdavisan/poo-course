package lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        Pen c1 = new Pen();
        c1.color = "Azul";
        c1.point = 0.5f;
        c1.uncover();
        
        c1.status();
        c1.scribble();
        
        Pen c2 = new Pen();
        c2.model = "Hostnet";
        c2.color = "Preta";
        c2.uncover();
        
        c1.status();
        c2.scribble();
    } 
}
