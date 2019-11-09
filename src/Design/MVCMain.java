package Design;

public class MVCMain {

    // need a student object
     // see  what it looks like before
    // need to be able to update the student object
    //see what it looks like after



    public static void main(String[]args){
        Student newS = genStudent();
        StudentView studentView = new StudentView();
        StudentController controller = new StudentController(newS, studentView);
        controller.updateView();
        controller.setStudentName("bessie");
        controller.updateView();
    }

    public static Student genStudent(){
        Student jeff = new Student("rejji","1234");
        return jeff;
    }
}
