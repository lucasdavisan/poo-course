package lesson11;

public class Lesson11 {
    public static void main(String[] args) {
        /*
        Visitant v1 = new Visitant();
        v1.setName("José");
        v1.setAge(22);
        v1.setGenre("M");
        System.out.println(v1.toString());
        */
        
        /*
        Student s1 = new Student();
        s1.setName("Cláudio");
        s1.setRegistrationNumber(1);
        s1.setCourse("Informática");
        s1.setAge(16);
        s1.setGenre("M");
        s1.montlyPayment();
        */
        
        /*
        ScholarshipStudent ss1 = new ScholarshipStudent();
        ss1.setRegistrationNumber(1112);
        ss1.setName("Jubileu");
        ss1.setScholarship(12.5f);
        ss1.setGenre("M");
        ss1.montlyPayment();
        */
        
        /*
        Teacher t1 = new Teacher();
        t1.setName("Danilo");
        t1.setAge(48);
        t1.setGenre("M");
        t1.setSpeciality("Geographer");
        t1.setSalary(1000f);
        */
        
        TechnicalStudent ts1 = new TechnicalStudent();
        ts1.setName("Ana");
        ts1.setAge(18);
        ts1.birthday();
        ts1.setCourse("Biologia");
        ts1.setGenre("F");
        ts1.setProfessionalRegistration(12345);
        System.out.println("{" + ts1.getName() + ", " + ts1.getAge() + ", " + ts1.getCourse() + ", " + ts1.getGenre() + ", " + ts1.getProfessionalRegistration() + "}");
    }
}
