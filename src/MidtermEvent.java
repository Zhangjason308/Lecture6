import java.util.*;

public class MidtermEvent {
    private Date d;
    private Prof p;

    public MidtermEvent(Date d, Prof p) {
        this.d = d;
        this.p = p;
    }

    public Prof getProf() {
        return p;
    }
    public Date getDate() {
        return d;
    }
}
