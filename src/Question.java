import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {

    private Number numberOfQuestion;
    private String textOfQuestion;
    private String singleOrMultiAnswer;
    public String correctAnswer;
    private List<Answer> answers;
    public int correctAnswers = 0;

    public Question(Number numberOfQuestion, String textOfQuestion, String singleOrMultiAnswer, String correctAnswer) {
        this.numberOfQuestion = numberOfQuestion;
        this.textOfQuestion = textOfQuestion;
        this.singleOrMultiAnswer = singleOrMultiAnswer;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer){
        this.answers.add(answer);
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void printInfo(){
        System.out.println(numberOfQuestion + "." + textOfQuestion + "(" + singleOrMultiAnswer + ")");

        for(Answer answer: answers){
            answer.printInfo();
        }

        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        if(userAnswer.equals(correctAnswer)){
            correctAnswers++;
        }
    }



}
