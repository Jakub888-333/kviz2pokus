import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private String nameOfQuiz;
    private String text;
    private List<Question> questions;
    private int totalCorrectAnswers;

    public Quiz(String nameOfQuiz, String text) {
        this.nameOfQuiz = nameOfQuiz;
        this.text = text;
        this.questions = new ArrayList<>();

    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void calculateTotalCorrectAnswers(){
        totalCorrectAnswers = 0;
        for(Question question: questions){
            totalCorrectAnswers += question.getCorrectAnswers();
        }
    }

    public void printInfo(){
        System.out.println(nameOfQuiz);
        System.out.println(text);
        System.out.println(" ");

        for(Question question: questions){
            question.printInfo();
        }

        calculateTotalCorrectAnswers();
        System.out.println("You had " + totalCorrectAnswers + "/3 answer correct");
    }





}
