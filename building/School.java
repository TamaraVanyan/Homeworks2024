package building;

class School extends Building {
    private int maxStudents;
    private Student[] students;
    private int studentCount = 0;
    private int teachersCount;

    public School(int voltage, int drainageSystemOuts, int maxStudents, int teachersCount) {
        super(voltage, drainageSystemOuts);
        this.maxStudents = maxStudents;
        this.teachersCount = teachersCount;
        this.students = new Student[maxStudents];
    }

    public int getTeachersCount() {
        return teachersCount;
    }

    public int getStudentsCount() {
        return studentCount;
    }

    public void addStudent(Student student) {
        if (studentCount < maxStudents) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student added: " + student.getInfo());
        } else {
            System.out.println("No more capacity for new students.");
        }
    }
}