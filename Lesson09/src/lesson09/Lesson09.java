package lesson09;
public class Lesson09 {
    public static void main(String[] args) {
        Person[] p = new Person[2];
        Book[] b = new Book[3]; 
        
        p[0] = new Person("Pedro", 22, "M");
        p[1] = new Person("Maria", 25, "F");
        
        b[0] = new Book("Aprendendo Java", "José da Silva", 300, p[0]);
        b[1] = new Book("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        b[2] = new Book("Java Avançado", "Maria Candido", 800, p[0]);
        
        b[0].open();
        b[0].browse(20);
        b[0].nextPage();
        System.out.println(b[0].details());
        
        System.out.println(b[1].details());
    }
}
