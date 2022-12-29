import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    public static final DateTimeFormatter DATE_TIME_FORMATTER=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    public static final DateTimeFormatter DATE_FORMATTER =DateTimeFormatter.ofPattern("dd.MM.yyyy ");
    public static final DateTimeFormatter TIME_FORMATTER =DateTimeFormatter.ofPattern(" HH:mm:ss");
    protected int id;
    private String title;
    private String description;
    private static int counter;
    private boolean isWork;
    protected LocalDateTime dateTime;


    public Task( String title, String description, boolean isWork, LocalDateTime dateTime) {
        this.id = ++counter;
        this.title = title;
        this.description = description;
        this.isWork = isWork;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static int getCounter() {
        return counter;
    }

    public boolean isWork() {
        return isWork;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Название задачи - " + title + '\'' +
                "описание задачи - " + description + '\'' +
                ", " + isWork +
                ", дата и время -" + dateTime ;
    }
}
