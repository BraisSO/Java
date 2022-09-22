package Question;

public class Question {
   int realAnswer;
   int userAnswer;

 private int imageId;

   String questionText;
   String answerTexto0;
   String answerTexto1;
   String answerTexto2;
   String answerTexto3;

  public Question (int imageId, String questionText, String answerTexto0, String answerTexto1, String answerTexto2, String answerTexto3, int realAnswer){
    this.imageId= imageId;
    this.questionText=questionText;
    this.answerTexto0=answerTexto0;
    this.answerTexto1=answerTexto1;
    this.answerTexto2=answerTexto2;
    this.answerTexto3=answerTexto3;
    this.realAnswer=realAnswer;

    this.userAnswer=-1;
  }
}