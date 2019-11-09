package Design;

enum Weekdays {
    Sunday("SUNDAY funday", true),
    Monday("MONDAY fudnay "),
    Tuesday("TUESDAY craazday");

    private String name;
    private boolean imp;
    Weekdays(String s, boolean imp) {
        this.name = s;
        this.imp = imp;
    }

    Weekdays(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImp() {
        return imp;
    }

    public String getName() {
        return name;
    }
}
