//interface
package iVote;

import java.util.*;

public interface IVoteFunctions {
	
	void numAnswers(int answers);//method to display number of answers
	void correctAnswers(Question question, int numStudents);// displays correct answers
	void submitAnswers(HashMap<Integer, String> map);// method to submit answers to the map
	void showQuestion(Question question);// shows question ( not used)
	void numSubmissions(int num);// prints submissions
	void showSubmissions(int ID);// shows answers
}
