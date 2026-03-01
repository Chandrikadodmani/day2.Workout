public class College {

    private String collegeName;
    private int totalStudents;

    // Constructor
    public College(String collegeName, int totalStudents) {
        this.collegeName = collegeName;
        this.totalStudents = totalStudents;
    }

    // Getter methods
    public String getCollegeName() {
        return collegeName;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        College c = new College("VTU Engineering College", 1200);

        System.out.println("College Name: " + c.getCollegeName());
        System.out.println("Total Students: " + c.getTotalStudents());
    }
}
