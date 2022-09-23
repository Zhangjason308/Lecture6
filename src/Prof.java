/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.ArrayList;
import java.util.Date;

public class Prof {
	private String name;
	private Date midtermDate;
	private ArrayList<CourseListener> courseListeners;//Changed Student to Course Listener in which we created an interface for Course Listener
	//private TeachingAssistant ta;

	public Prof(String aName) {
		this.name = aName;
		this.courseListeners = new ArrayList<>();
	}

	public Date getMidterm() {
		return this.midtermDate;
	}

	public String getName() {
		return this.name;
	}

	public void setMidterm(Date date) {
		this.midtermDate = date; //when this date is set, tell the students
		for(CourseListener s: this.courseListeners){ //tell each student in students to choose study date
			s.handleMidtermDate(date);
		}

	}
	
	public void postponeMidterm(Date date){
		this.midtermDate = date;
		for(CourseListener s: this.courseListeners){
			s.handleMidtermPostponementDate(date);
		}
		ta.postpone(date);
	}
	
	public void setTA(TeachingAssistant theTA){
		this.courseListeners.add(theTA);
	}
	
	public void addStudent(Student s){
		this.students.add(s);
	}


	public static void main(String[] args) {

		Prof p = new Prof("Babak");
		Student s = new Student("Homer");
		Student s2 = new Student("Bart");
		TeachingAssistant ta = new TeachingAssistant("Michael");
	
	
		p.addStudent(s);
		p.addStudent(s2);
		p.setTA(ta);
	
		Date midterm = new Date();
		p.setMidterm(midterm);
	
		p.postponeMidterm(new Date(midterm.getTime() + 1000000000));
	}

}
