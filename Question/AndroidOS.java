package Question;

public class AndroidOS {
    public AndroidOS() {
        System.out.println("AndroidOS Booting Up...");
    }

    public void runQuizApp() {
      Question question1 = new Question(921238,"How tall is the Eiffel tower?", "1024 ft","1063 ft", "1124 ft","1163 ft", 1);

  System.out.println("Question 1: " + question1.questionText);
  System.out.println("Question 1 Correct Answer: " + question1.realAnswer);
  System.out.println("Question 2, answer0: " + question1.answerTexto0);
  System.out.println("Question 3, answer3: " + question1.answerTexto1);
  System.out.println("Question 3, answer3: " + question1.answerTexto2);
  System.out.println("Question 3, answer3: " + question1.answerTexto3);
    
    }

    public static void main(String[] args) {
        System.out.println("Starting: AndroidOS");
        AndroidOS androidOS = new AndroidOS();
        androidOS.runQuizApp();
    }
}