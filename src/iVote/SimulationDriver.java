// simulation driver that drives all the other classes

package iVote;

import java.util.*;

public class SimulationDriver 
{

	public static void main(String[] args)
	{
			
		ArrayList<Student> students = new ArrayList<Student>();//initializes map
		int numStudents = (int) ((Math.random() * 30) + 10);
				
		for (int i=0; i<numStudents; i++) 
		{
			students.add(new Student((int) ((Math.random() * 30) +10)));
		}
		
		int[] id = new int[students.size()];
				
		for (int i=0; i<numStudents; i++)
		{
			id[i] = students.get(i).getID();
		}
				
		IVote test = new IVote(id);
		System.out.println("IVote Simulator \n");	//creates iVote object and random to decide for question type
		int rand;
		int rand2;
		String answer = "";
		rand = (int) (Math.random()*10);// randomly sets correct answer
		if (rand < 5)
		{
			rand = (int) (Math.random()*10);
			if (rand <=2)
			{
				answer = "a";
			}
			if ((rand <=5) && (rand >2))
			{
				answer = "b";
			}
			if ((rand <=7) && (rand >5))
			{
				answer = "c";
			}
			if ((rand <=10) && (rand >7))
			{
				answer = "d";
			}
			System.out.println("Question type 1, 1 answer only");
			Question question1 = new Question(answer);
			for (int i=0; i<numStudents; i++)//randomly generates answers a-d for students
			{
				rand = ((int) Math.random());
				if (rand <=2)
				{
					answer = "a";
				}
				if ((rand <=5) && (rand >2))
				{
					answer = "b";
				}
				if ((rand <=7) && (rand >5))
				{
					answer = "c";
				}
				if ((rand <=10) && (rand >7))
				{
					answer = "d";
				}

				test.submitAnswers(random(students, rand, question1, 36));
			}
			test.correctAnswers(question1, numStudents);
		}
		else
		{		
			String answer2 = "";
			rand2 = (int) (Math.random()*10);
			rand = (int) (Math.random()*10);
			System.out.println("Question type 2, 2 answer only");// if 2 answers are needed then it sets both
			if (rand <=2)
			{
				answer = "a";
			}
			if ((rand <=5) && (rand >2))
			{
				answer = "b";
			}
			if ((rand <=7) && (rand >5))
			{
				answer = "c";
			}
			if ((rand <=10) && (rand >7))
			{
				answer = "d";
			}
			if (rand2 <=2)
			{
				answer2 = "a";
			}
			if ((rand2 <=5) && (rand >2))//sets answers 1 and 2
			{
				answer2 = "b";
			}
			if ((rand2 <=7) && (rand >5))
			{
				answer2 = "c";
			}
			if ((rand2 <=10) && (rand >7))
			{
				answer2 = "d";
			}
			Question question2 = new Question(answer);
			question2.setRightAnswer2(answer2);
			for (int i=0; i<numStudents; i++)
			{
				rand = (int) Math.random()*10;
				if (rand <=2)
				{
					answer = "a";
				}
				if ((rand <=5) && (rand >2))
				{
					answer = "b";
				}
				if ((rand <=7) && (rand >5))
				{
					answer = "c";
				}
				if ((rand <=10) && (rand >7))//searches to see if it is right and displays the total
				{
					answer = "d";
				}

				test.submitAnswers(random(students, rand, question2, 36));
			}
			test.correctAnswers(question2, numStudents);
			}
			}
			
	
	private static HashMap<Integer, String> random (ArrayList<Student> students, int numStudents, 
			Question question, int numAnswers) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for (int i=0; i<numStudents; i++) {
			if (question.getRightAnswer().length() == 1) {
				students.get(i).getAnswer();
			}
		}
		
		for (int i=0; i<numStudents; i++) {
			map.put(students.get(i).getID(), students.get(i).answer);
		}
		
		return map;
	}

}
