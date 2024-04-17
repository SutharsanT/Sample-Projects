package SmapleProject;
import java.util.Scanner;

class Question 
{
 private String questionText;
 private String[] options;
 private int correctOptionIndex;

 public Question(String questionText, String[] options, int correctOptionIndex) 
 {
     this.questionText = questionText;
     this.options = options;
     this.correctOptionIndex = correctOptionIndex;
 }
 public void displayQuestion() 
 {
     System.out.println(questionText);
     for (int i = 0; i < options.length; i++) 
     {
         System.out.println((i + 1) + ". " + options[i]);
     }
 }
 public boolean isCorrect(int selectedOptionIndex) 
 {
     return selectedOptionIndex == correctOptionIndex;
 }
}
class Quiz {
 private Question[] questions;
 private int score;
 public Quiz(Question[] questions) {
     this.questions = questions;
     this.score = 0;
 }
 public void start() 
 {
     Scanner sc = new Scanner(System.in);

     for (Question question : questions) 
     {
         question.displayQuestion();
         System.out.print("Your answer: ");
         int answer = sc.nextInt();
         if (question.isCorrect(answer - 1)) 
         {
             score++;
         } 
     }
     System.out.println("Quiz completed!");
     System.out.println("Your score: " + score + "/" + questions.length);
 	}
}

public class Quiz_Application 
	{
	public static void main(String[] args) 
		{
		System.out.println("Type Option Number Only...........");
		System.out.println();
		Question[] questions = {
		 new Question("How many cylinder are in BMW M5 cs?", new String[]{"12", "6", "10", "8"}, 3) ,
         new Question("Which car have W16 Engine?", new String[]{"Lamborghini", "Ferrari", "BMW", "Bugatti"}, 3),
         new Question("How mnay Rolls Royce have in india?", new String[]{"10 to 15", "25 to 30", "15 to 20", "20 to 25"}, 1) ,
         new Question("In below option which is not bike and car company?", new String[]{"Mahindra", "Suzuki", "Honda", "BMW"}, 1) ,
         new Question("which cartoon is telecast in C.N?", new String[]{"Beam", "Dora", "Ben 10", "Doremon"}, 2) ,
         new Question("Which programming language is invented by James Gosling?", new String[]{"C Programming", "R", "Java", "SQL"}, 2) };
		Quiz quiz = new Quiz(questions);
		quiz.start();
		}
	}