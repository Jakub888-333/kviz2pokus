import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Answer answer1 = new Answer("a", "5");
            Answer answer2 = new Answer("b", "4");
            Answer answer3 = new Answer("a", "4");
            Answer answer4 = new Answer("b", "7");
            Answer answer5 = new Answer("a", "2^2");
            Answer answer6 = new Answer("b", "-2^2");
            Answer answer7 = new Answer("c", "1+3");
            Answer answer8 = new Answer("d", "4^1");

            Question question1 = new Question(1, "What is 2 + 2", "Question with single answer", "b");
            Question question2 = new Question(2, "What is 2 + 5", "Question with single answer", "b");
            Question question3 = new Question(3, "4=?", "Question with multiple answer", "abcd");

            question1.addAnswer(answer1);
            question1.addAnswer(answer2);
            question2.addAnswer(answer3);
            question2.addAnswer(answer4);
            question3.addAnswer(answer5);
            question3.addAnswer(answer6);
            question3.addAnswer(answer7);
            question3.addAnswer(answer8);

            Quiz quiz = new Quiz("Welcome to quiz Math Quiz.", "This quiz has 3 questions.");
            quiz.addQuestion(question1);
            quiz.addQuestion(question2);
            quiz.addQuestion(question3);

            quiz.printInfo();



            return;
        }
    }
}