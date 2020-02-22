package ultraemojicombat;
public class Fighter {
    // Attributes
    private String name, nationality, category;
    private int age, victories, defeats, draws;
    private float height, weight;
    // Methods
    public void toIntroduce() {
        System.out.println("----------------------------------------------------");
        System.out.println("IT'S TIME! We introduce the fighter: " + this.getName());
        System.out.println("Directly from: " + this.getNationality());
        System.out.println(this.getAge() + " years old");
        System.out.println(this.getHeight() + " meters long.");
        System.out.println("Weighing: " + this.getWeight());
        System.out.println("Victories: " + this.getVictories());
        System.out.println("Defeats: " + this.getDefeats());
        System.out.println("Draws: " + this.getDraws());
    }
    
    public void status() {
        System.out.println(this.getName() + " is a/an " + this.getCategory() + " weight");
        System.out.println("Won " + this.getVictories() + " times.");
        System.out.println("Lost " + this.getDefeats() + " times.");
        System.out.println("Drew " + this.getDraws() + " times.");
    }
    
    public void toWinFight() {
        this.setVictories(this.getVictories() + 1);
    }
    
    public void toLoseFight() {
        this.setDefeats(this.getDefeats() + 1);
    }
    
    public void toDrawFight() {
        this.setDraws(this.getDraws() + 1);
    }
    // Special Methods
    public Fighter(
            String na, String nat, int age, 
            float he, float we, 
            int vi, int de, int ti) {
        this.setName(na);
        this.setNationality(nat);
        this.setAge(age);
        this.setHeight(he);
        this.setWeight(we);
        this.setVictories(vi);
        this.setDefeats(de);
        this.setDraws(ti);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String na) {
        this.name = na;
    }
    
    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(String na) {
        this.nationality = na;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public float getHeight() {
        return this.height;
    }
    
    public void setHeight(float he) {
        this.height = he;
    }
    
    public float getWeight() {
        return this.weight;
    }
    
    public void setWeight(float we) {
        this.weight = we;
        this.setCategory();
    }
    
    public int getVictories() {
        return this.victories;
    } 
    
    public void setVictories(int vi) {
        this.victories = vi;
    }
    
    public int getDefeats() {
        return this.defeats;
    }
    
    public void setDefeats(int de) {
        this.defeats = de;
    }
    
    public int getDraws() {
        return this.draws;
    }
    
    public void setDraws(int dr) {
        this.draws = dr;
    }
    
    public String getCategory() {
        return this.category;
    }
    
    private void setCategory() {
        if(this.weight < 52.2) {
            this.category = "Invalid";
        } else if (this.weight <= 70.3) {
            this.category = "Light";
        } else if (this.weight <= 83.9) {
            this.category = "Middle";
        } else if (this.weight <= 120.2) {
            this.category = "Heavy";
        } else {
            this.category = "Invalid";
        }
    }
}
