/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

/*
***********Lecture 7 *******************
- Once we deleted attribute p in MidtermEvent. This class is affected.
  if we change handleMidterm to event.getSource... instead of event.prof... then we can't call .getName() following it
- So in the handleMidterm method, initialize prof P and cast the event.getSource() to Prof
	ex: Prof p = (Prof) event.getSource();
- Now we change it so that we create Object o and
 Object o = event.getSource(); // create object o
		if (o instanceof Prof p) {
			System.out.println(p.getName());
		}
 */
import java.util.Date;

public class Student implements CourseListener {
	private String name;
	private Date midterm;

	public Student(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void study(Date date){
		this.midterm = date;
		System.out.println(name + " : Doh! I have to study hard for my midterm on " + this.midterm);
	}
	
	public void party(Date date){
		this.midterm = date;
		System.out.println(name + " : Alright! I get to party since my midterm isn't until " + this.midterm);
	}

	@Override
	public void handleMidtermDate(MidtermEvent event) {
			System.out.println(event.getProf().getName());
			study(event.getDate());
	}

	@Override
	public void handleMidtermPostponementDate(MidtermEvent event) {
		party(event.getDate());
	}

}
