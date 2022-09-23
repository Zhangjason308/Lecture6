import java.util.Date;

public interface CourseListener {
    void handleMidtermDate(MidtermEvent m);

    void handleMidtermPostponementDate(Date date);

    void handleMidtermPostponeDate(Date date);
}
