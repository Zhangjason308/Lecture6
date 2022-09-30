import java.util.Date;

public interface CourseListener {
    void handleMidtermDate(MidtermEvent event);

    void handleMidtermPostponement(MidtermEvent event);
}
