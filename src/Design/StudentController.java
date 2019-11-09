package Design;

public class StudentController {
    Student model;
    StudentView view;
    public StudentController(Student model, StudentView view){
        this.view = view;
        this.model = model;
    }

    public void setStudentRollN(String rollN){
        this.model.setRollNo(rollN);
    }

    public void setStudentName(String name){
        this.model.setName(name);
    }

    public String getRollN() {
        return model.getRollN();
    }

    public String getName() {
        return model.getName();
    }

    public void updateView(){
        view.printView(model.getName(),model.getRollN());
    }
}
