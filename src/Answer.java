public class Answer {

    private String numberOfAnswer;
    private String textOfAnswer;

    public Answer(String numberOfAnswer, String textOfAnswer){
        this.numberOfAnswer = numberOfAnswer;
        this.textOfAnswer = textOfAnswer;
    }

    public void printInfo(){
        System.out.println(numberOfAnswer + "." + textOfAnswer);
    }

}
