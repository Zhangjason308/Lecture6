import java.util.Date;

public interface CourseListener {
    void handleMidtermDate(Date date);

    void handleMidtermPostponementDate(Date date);

    void handleMidtermPostponeDate(Date date);
}
