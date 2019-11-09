package Design;

public class EnumWithValues {
    public static void main(String[] args) {
        Weekdays[] weekdays = Weekdays.values();
        for(Weekdays week: weekdays){
            System.out.println(week.getName());
            System.out.println(week.isImp());
        }
        System.out.println(Weekdays.Sunday);
    }
}
