
public class TestIncrement {
    private static int count = 0;
    private int jobID;
    private String name;

    private boolean isFilled;

    public TestIncrement(String title) {
        name = title;

        isFilled = false;
        setJobID(++count);
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }
    public static void resetIds(){
        count = 0;
    }


    public static void main(String[]args){
        TestIncrement one = new TestIncrement("holla");
        TestIncrement two = new TestIncrement("molla");
        System.out.println(one.jobID);
        one.resetIds();

        System.out.println(two.jobID);
        TestIncrement three = new TestIncrement("dolla");
        System.out.println(three.jobID);
        TestIncrement sthree = new TestIncrement("molla");

        System.out.println(sthree.jobID);





    }
}