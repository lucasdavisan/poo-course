package ultraemojicombat;

import java.util.Random;

public class Fight {
    // Attributes
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;
    // Public Methods
    public void markFight(Fighter l1, Fighter l2) {
        if(l1.getCategory().equals(l2.getCategory()) && l1 != l2) {
            this.approved = true;
            this.challenged = l1;
            this.challenger = l2;
        } else {
            this.approved = false;
            this.challenged = null;
            this.challenger = null;        
        }
    }
    
    public void fight() {
        if(this.approved) {
            System.out.println("### CHALLENGED ###");
            this.challenged.toIntroduce();
            System.out.println("### CHALLENGER ###");
            this.challenger.toIntroduce();
            
            Random rand = new Random();
            int winner = rand.nextInt(3);
            System.out.println("========== FIGHT'S RESULT ==========");
            switch(winner) {
                case 0:
                    System.out.println("Drew!");
                    this.challenger.toDrawFight();
                    this.challenged.toDrawFight();
                    break;
                case 1:
                    System.out.println("The winner is: " + this.challenged.getName());
                    this.challenged.toWinFight();
                    this.challenger.toLoseFight();
                    break;
                case 2:
                    System.out.println("The winner is: " + this.challenger.getName());
                    this.challenger.toWinFight();
                    this.challenged.toLoseFight();
                    break;
            }
            System.out.println("====================================");
            
        } else {
            System.out.println("The fight can't be marked.");
        }
    }
    //Special Methods

    public Fighter getChallenged() {
        return this.challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
}
