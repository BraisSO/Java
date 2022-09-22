package GameLogicPtI;

public class MainActivity {

    public int generateRandomNumber(int max) {
    int numRandom= (int)(Math.random()*max);
    return numRandom;
    }
    
    public String getGameOverMessage(int totalCorrect, int totalQuestions) {
        String derrota="You got " + totalCorrect + " right out of " + totalQuestions+".  Better luck next time!";
        String victoria="You got all " + totalQuestions + " right! You won!";
    if (totalCorrect == totalQuestions){
    return (victoria);
    }
    else {
      return (derrota);
    }
    
    }
    
    }
