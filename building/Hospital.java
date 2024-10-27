package building;

class Hospital extends Building {
    private int roomsCount;
    private String[] illnesses = {"Flu", "Neurosis", "Covid", "Diabetes", "Asthma", "Hypertension"};
    private int staffCount;

    public Hospital(int voltage, int drainageSystemOuts, int roomsCount, int staffCount) {
        super(voltage, drainageSystemOuts);
        this.roomsCount = roomsCount;
        this.staffCount = staffCount;
    }

    public void removeStaff(String fullName) {
        if (staffCount > 0) {
            staffCount--;
            System.out.println("Staff member " + fullName + " has been removed. Remaining staff count: " + staffCount);
        } else {
            System.out.println("No staff to remove.");
        }
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public String[] getIllnesses() {
        return illnesses;
    }
}