package project05;

public class Transcript {

	private Student students;
	private Course courses;
	private String date;
	private String grade;

	public Transcript(Student student, Course course) {
		this.students=student;
		student.addTranscript(this);
		this.courses=course;
		course.addTranscript(this);	
	}

	public Student getStudent(){
		return students;
	}

	public Course getCourse(){
		return courses;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}