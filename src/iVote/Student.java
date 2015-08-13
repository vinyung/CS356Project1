package iVote;

//* student class which allows the setting and getting of answers for each student

public class Student {
	
	private int id;//id to identify student
	String answer;
	
	public Student (int id, String answer) {
		this.id = id;//constructor with answer
		this.answer = answer;
	}
	
	public Student (int id) {//constructor
		this.id = id;
	}
	
	public int getID() {// gets id and returns it
		return id;
	}
	
	public void setID(int id) {//sets id for student
		this.id = id;
	}
	
	public String getAnswer() {//gets their answer
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;//sets their answer
	}
	
}

