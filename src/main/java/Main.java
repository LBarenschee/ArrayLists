import model.*;

public class Main {

    public static void main(String[] args) {
        ComputerScienceStudent student1 = new ComputerScienceStudent
        ("Klaus Klausen", 111, "Java", "Hamburg", "ABC123");

        ComputerScienceStudent student2 = new ComputerScienceStudent
        ("Jan Jansen", 222, "Java", "Hamburg", "DEF123");

        ComputerScienceStudent student3 = new ComputerScienceStudent
                ("Hinrich Hinrichsen", 333, "Java", "Hamburg", "GHI123");

        ChemistryStudent student4 = new ChemistryStudent("Jonas Jonasson", 444, "Tests");

        ComputerScienceStudent student5 = new ComputerScienceStudent
                ("Paul Paulsen", 555, "Java", "Hamburg", "JKL123");
        Student[] students = {student1, student2, student3, student4, student5};

        StudentDB newDB = new StudentDB(students);
        System.out.println(newDB);

        ComputerScienceStudent student6 = new ComputerScienceStudent
                ("Marius", 666, "Java", "Hamburg", "MNO123");
        System.out.println(student6);

    }

}
