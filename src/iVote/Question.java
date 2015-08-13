package iVote;

public class Question {
	
	private String rightAnswer2;// variables for answers 1 and 2
	private String rightAnswer;
	
	public Question(String rightAnswer) {// sets the right answer for answer 1
		this.setRightAnswer(rightAnswer);
	}
	public Question(String rightAnswer, String rightAnswer2) {// sets for answer 2
		this.setRightAnswer(rightAnswer);
		this.setRightAnswer2(rightAnswer2);
	}
	
	public String getRightAnswer() {// gets the correct answer
		return rightAnswer;
	}
	
	public void setRightAnswer(String rightAnswer) {// sets right answer1
		this.rightAnswer = rightAnswer;
	}
	
	public void setRightAnswer2(String rightAnswer2) {
		this.rightAnswer2 = rightAnswer2;
	}//sets and gets right answer 1 and 2
	public String getRightAnswer2() {
		return rightAnswer2;
	}
	
	public void setRightAnswe2r(String rightAnswer2) {
		this.rightAnswer2 = rightAnswer2;
	}
	
}
