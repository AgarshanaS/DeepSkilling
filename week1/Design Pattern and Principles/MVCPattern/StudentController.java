package MVCPattern;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Model
        Student student = new Student("Alice", "S101", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display initial data
        controller.updateView();

        // Update student info
        controller.setStudentName("Alice Johnson");
        controller.setStudentGrade("A+");

        // Display updated data
        controller.updateView();
    }
}

