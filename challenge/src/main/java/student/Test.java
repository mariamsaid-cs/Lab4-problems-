package student;

public class Test {
    public static void main(String[] args) {


        // Display computer science students
        Major cs = new Major("23", "computer science");
        Major math = new Major("10", "mathematics");
        Student s1 = new Student("SAFI", "Amal", "1234", "12345", "22885676", cs);
        Student s2 = new Student("ALAMI", "Samir", "1234", "12345", "23585976", cs);
        Student s3 = new Student("SAID", "Mariam", "11112", "3334", "23456778", math);

        cs.displayStudents();

        //11. test the newly created methods
        System.out.println("\n--- New methods demonstration ---");

        // getFullNameFormatted
        System.out.println("Formatted name: " + s1.getFullNameFormatted());

        // findStudentByCNE
        Student found = cs.findStudentByCNE("22885676");
        System.out.println("Found by CNE: " + (found != null ? found : "null"));

        // getStudentCount
        System.out.println("CS student count: " + cs.getStudentCount());

        // removeStudent
        boolean removed = cs.removeStudent("23585976");
        System.out.println("Removed Samir: " + removed);
        System.out.println("CS student count after removal: " + cs.getStudentCount());

        // getOccupancyRate
        System.out.printf("CS occupancy rate: %.1f%%%n", cs.getOccupancyRate());

        // getStudentListAsString after removal
        System.out.println("\n" + cs.getStudentListAsString());

    }
}

