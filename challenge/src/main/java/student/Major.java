package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount ;

    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        this.id = nextId++;
        this.students = new Student[]{};
        studentCount = 0;
    }
    public Major(){
        this.code = "";
        this.name = "";
        this.id = nextId++;
        this.students = new Student[]{};
        studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount < 50){
            Student[] studentAdded = new Student[students.length + 1];
            for(int i = 0; i < studentCount; i++){
                studentAdded[i] = students[i];
            }
            studentAdded[studentCount] = s;
            this.students = studentAdded;
            studentCount++;
        }else {
            System.out.println("the number of students in this major is 50.");
        }

    }

    // Getters
    public String getCode(){return this.code;}
    public String getName(){return this.name;}
    public int getId(){return this.id;}
    public int getStudentCount(){return this.studentCount;}
    public Student[] getstudents(){return this.students;}
    //Setters
    public void setCode(String code){this.code = code;}
    public void setName(String name){this.name = name;}
    //toString
    @Override
    public String toString(){
        return "Major[id= " + id + ", code= " + code + ", name= " + name + "]";
    }


    // Display all students in the major
    public void displayStudents() {
        for(Student s : students){
            System.out.println(s.toString());
        }
    }

    //find student by CNE
    public Student findStudentByCNE(String cne){
        for(Student s : students){
            if(s.getCne().equals(cne)) return s;
        }
        return null;
    }

    //8. remove student
    public boolean removeStudent(String cne){
        Student s = findStudentByCNE(cne);
        if(s == null) return false;

        int index = -1;
        for(int i = 0; i < studentCount; i++){
            if(students[i] == s){
                index = i;
                break;
            }
        }
        if(index == -1) return false;

        for(int j = index; j < studentCount - 1; j++){
            students[j] = students[j + 1];
        }
        students[studentCount - 1] = null;
        studentCount--;
        return true;
    }

    //9. get occupied capacity
    public double getOccupancyRate(){
        return ((double) studentCount / 50.0) * 100.0;
    }

    //10. get student as string
    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder();
        sb.append("The list of the students in the ").append(name).append(" major is :\n");
        for(int i = 0; i < students.length; i++){
            sb.append(students[i].getId()).append(". ").append(students[i].toString());
            if(i < students.length - 1) sb.append("\n");
        }
        return sb.toString();
    }


}
