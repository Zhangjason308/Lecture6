/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.Date;

public class TeachingAssistant implements CourseListener {
	private String name;
	private Date midterm;

	public TeachingAssistant(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void proctor(Date date){
		this.midterm = date;
		System.out.println(name + " : I have to proctor a midterm on " + this.midterm);
	}
	
	public void postpone(Date date){
		this.midterm = date;
		System.out.println(name + " : Now the midterm is on " + this.midterm);
	}


	public void handleMidtermDate(Date date) {
		this.postpone(date);
	}

	@Override
	public void handleMidtermPostponementDate(Date date) {
		this.postpone(date);
	}

	@Override
	public void handleMidtermPostponeDate(Date date) {

	}


}

