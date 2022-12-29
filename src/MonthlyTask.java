import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task implements Repeatable{
    public MonthlyTask(String title, String description, boolean isWork, LocalDateTime dateTime) {
        super(title, description, isWork, dateTime);
    }

    @Override
    public boolean checkIfSuitable(LocalDate date) {
        return date.getDayOfMonth()== dateTime.getDayOfMonth();
    }
}
