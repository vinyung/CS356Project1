package iVote;

import java.util.HashMap;

/**
 * @author Vincent Yung
 * IVote takes user input and counts how many of each answer is submited
 */
public class IVote implements IVoteFunctions{

	HashMap<Integer, String> map = new HashMap<Integer, String>();
	private int[] ids;
	
	public IVote(int[] ids) {
		
		this.ids = ids;
		
	}
	
	@Override
	public void numAnswers(int answers) {// counts how many of each answer
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		
		for (int i=0; i<ids.length; i++) {
			for (int j=0; j<map.get(ids[i]).length(); j++) {
				if (map.get(ids[i]).charAt(j) != 0)
				{
				if (map.get(ids[i]).charAt(j) == 'A') {
					A++;
				}
				if (map.get(ids[i]).charAt(j) == 'B') {
					B++;
				}
				if (map.get(ids[i]).charAt(j) == 'C') {
					C++;
				}
				if (map.get(ids[i]).charAt(j) == 'D') {
					D++;
				}
				}
			}
		}
		
		System.out.println("A:" + A);
		System.out.println("B:" + B);
		System.out.println("C:" + C);
		System.out.println("D:" + D);
	}

	@Override
	public void correctAnswers(Question question, int numStudents) {
		int correct = 0;
		int incorrect = 0;
		for (int i=0; i<numStudents; i++) {
			if (question.getRightAnswer().equals(map.get(ids[i]))) 
			{
				correct++;
			}
			else
			{
				incorrect++;
			}
		}
		
		System.out.println("Total correct answers: " + correct);// total correct and incorrect
		System.out.println("Total incorrect answers: " + incorrect);
		
	}

	@Override
	public void submitAnswers(HashMap<Integer, String> map) {
		this.map = map;
	}

	@Override
	public void showQuestion(Question question) {
	}

	//@Override
	public void numSubmissions(int num) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void showSubmissions(int id) {
//		// TODO Auto-generated method stub
	
	}

}
