public class GuessObj {
    int num, numGuesses, guess;
    public GuessObj(){
        numGuesses=0;
        guess=0;
        num=(int)(Math.random()*100)+1;
    }
    
    public int getNumGuesses(){
        return numGuesses;
    }
    
    public String giveHint(){
        if(guess>num){
            return "Lower.";
        }
        else if (guess<num){
            return "Higher.";
        }
        else return "Correct!";
    }
    
    public boolean setGuess(int g){
        boolean isValid=(g>=1 && g<=100);
        if(isValid){
            guess=g;
            numGuesses++;
            return true;
        }
        else return false;
    }
    
    
    
}