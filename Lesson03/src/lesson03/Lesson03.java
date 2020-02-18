package lesson03;
public class Lesson03 {
    public static void main(String[] args) {
        Pen c1 = new Pen();
        c1.model = "BIC Cristal";
        c1.color = "Azul";
        // c1.point = 0.5f;
        c1.charge = 80;
        // c1.covered = false;
        c1.cover();
        c1.status();
        c1.scribble();
    }
    
}
