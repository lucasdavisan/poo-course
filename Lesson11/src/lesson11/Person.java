package lesson11;
public abstract class Person {
    protected String name;
    protected int age;
    protected String genre;
    
    public void birthday() {
        this.setAge(this.getAge() + 1);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Dados{" + "name=" + name + ", age=" + age + ", genre=" + genre + '}';
    }
}
