package generics;

class StudentGrades implements Comparable<StudentGrades>{
    private String name;
    private int mathKnowledge;
    private int physicsKnowledge;
    private int historyKnowledge;

    public StudentGrades(String name, int mathKnowledge, int physicsKnowledge, int historyKnowledge) {
        this.name = name;
        this.mathKnowledge = mathKnowledge;
        this.physicsKnowledge = physicsKnowledge;
        this.historyKnowledge = historyKnowledge;
    }

    public String getName() {
        return name;
    }

    public int getMathKnowledge() {
        return mathKnowledge;
    }

    public int getPhysicsKnowledge() {
        return physicsKnowledge;
    }

    public int getHistoryKnowledge() {
        return historyKnowledge;
    }


    @Override
    public int compareTo(StudentGrades other) {
        int thisTotal = this.mathKnowledge + this.physicsKnowledge + this.historyKnowledge;
        int otherTotal = other.mathKnowledge + other.physicsKnowledge + other.historyKnowledge;
        return Integer.compare(thisTotal, otherTotal);
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Math: " + mathKnowledge +
                ", Physics: " + physicsKnowledge +
                ", History: " + historyKnowledge;
    }
//2-rd xndri hamar
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentGrades that = (StudentGrades) obj;
        return mathKnowledge == that.mathKnowledge &&
                physicsKnowledge == that.physicsKnowledge &&
                historyKnowledge == that.historyKnowledge &&
                name.equals(that.name);
    }
}