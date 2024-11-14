package building;

class Main {
    public static void main(String[] args) {
        Building building = new Building(220, 10);
        System.out.println("Building Voltage: " + building.getVoltage());
        System.out.println("Drainage System Outs: " + building.getDrainageSystemOuts());
        System.out.println("_____________________________________________");
        School school = new School(210, 50, 2, 80);
        school.addStudent(new Student("Exo", "Exishyan", 15));
        school.addStudent(new Student("Vazgen", "Petrosyan", 14));
        school.addStudent(new Student("Gago", "Gagikyan", 7));

        System.out.println("Number of Teachers: " + school.getTeachersCount());
        System.out.println("Number of Students: " + school.getStudentsCount());
        System.out.println("____________________________________________");
        Hospital hospital = new Hospital(225, 80, 20, 15);
        hospital.removeStaff("Dr. Ara Babakhanyan");
        hospital.removeStaff("Dr. Aram Grigoryan");
        System.out.println("Remaining Staff Count: " + hospital.getStaffCount());

    }
}