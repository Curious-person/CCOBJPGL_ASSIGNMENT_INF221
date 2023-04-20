public class exercise1 {
    static boolean iwillNotCheat = false;
    static boolean iwillWin = true;

    public static void main(String[] args) {
    
    assert iwillNotCheat == true: "Because I was inspired by my peers.";

    enterCompetition();

    assert iwillWin == true: "Because I do not want to .";


    }
static void enterCompetition(){
    iwillWin = false;

    }
}
