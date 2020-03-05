package lesson09;
public class Person {
    private String name;
    private int age;
    private String genre;
    
    public void Birthday() {
        this.age++;
    }
    
    public Person(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String n) {
        n = this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int a) {
        a = this.age;
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String g) {
        g = this.genre;
    }
}
