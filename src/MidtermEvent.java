import java.util.*;

/********** Lecture 7 ***********
- Referenced to the source (Prof)
 - just inherit this from the class than encapsulates the source... so make MidtermEvent extend EventObject
-  Constructor chaining is a good solution -> make sure everything is initialized, make sure everything in the super class is initialized
    Call super(prof) in the constructor
    EventObject doesn't have a default constructor, so calling super() does not work, you need super(p)
 -Inheriting from super allows us to delete attribute Prof p . Now the method getProf() is not needed. SO that means all classes that use prof
 are going to be affected
 */

public class MidtermEvent extends EventObject{
    private final Date d; // immutable
    //private final Prof p; // immutable

    public MidtermEvent(Date d, Prof p) {
        super(p);
        this.d = d;
        //this.p = p;
    }

    public Prof getProf() { // Now that we deleted attribute p, we don't need this method
        return (Prof) getSource(); //downcast to Prof
    }

    public Date getDate() {

        return d;
    }
}
