import java.util.ArrayList;

public class DayOfWeek {

    public String getDay(Integer dayNumber) {
        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");

        if (dayNumber == null)
            return "Input dayNumber is null.";
        else if (dayNumber < 1 || dayNumber > 7)
            return "The number should be between 1 and 7.";
        else
            return daysList.get(dayNumber - 1);
    }


}
