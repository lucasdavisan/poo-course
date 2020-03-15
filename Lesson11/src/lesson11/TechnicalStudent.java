package lesson11;
public class TechnicalStudent extends Student {
    private int ProfessionalRegistration;
    private int skillsCounter;
    
    public void practice() {
        this.setSkillsCounter(this.getSkillsCounter() + 1);
    }

    public int getProfessionalRegistration() {
        return ProfessionalRegistration;
    }

    public void setProfessionalRegistration(int ProfessionalRegistration) {
        this.ProfessionalRegistration = ProfessionalRegistration;
    }

    public int getSkillsCounter() {
        return skillsCounter;
    }

    public void setSkillsCounter(int skillsCounter) {
        this.skillsCounter = skillsCounter;
    }

    @Override
    public String toString() {
        return "TechnicalStudent{" + "ProfessionalRegistration=" + ProfessionalRegistration + ", skillsCounter=" + skillsCounter + '}';
    }
}
