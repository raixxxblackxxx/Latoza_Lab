public class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("Jak", 1234, "Second Year");
        Teacher teacher = new Teacher("Frinz", 1875, "Science");
        Staff staff = new Staff("Renz", 1345, "Biology Department");

       
        student.displayInfo();
        teacher.displayInfo();
        staff.displayInfo();
    }
}