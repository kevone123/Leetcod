package Design;

public class Student {
    private String rollN;
    private String name;

    Student(String name, String rollN){
        this.name = name;
        this.rollN = rollN;
    }
    public String getRollN(){
        return rollN;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollN = rollN;
    }


}
