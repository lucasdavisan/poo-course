package lesson12;
public abstract class Animal {
    protected float weight;
    protected int age;
    protected int members;
    
    public abstract void move();
    public abstract void eat();
    public abstract void emitSound();

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
}
