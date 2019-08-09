import java.util.Optional;

public class WeekendPlanner {
    public static void main(String[] args) {
        WeekendPlanner weekendPlanner = new WeekendPlanner();
        Optional<String> scheduleWeekDay, scheduleWeekEnd;
        scheduleWeekDay = weekendPlanner.returnSchedule("Monday");
        scheduleWeekDay.ifPresent(System.out::println);
        scheduleWeekEnd = weekendPlanner.returnSchedule("Sunday");
        scheduleWeekEnd.ifPresent(System.out::println);

    }

    public Optional<String> returnSchedule(String day){
        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
            return Optional.of("Study");
        }
        return Optional.empty();
    }

}
