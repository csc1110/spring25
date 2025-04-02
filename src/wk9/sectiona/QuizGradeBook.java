package wk9.sectiona;

public class QuizGradeBook {
    private static final int MAX_QUIZZES = 5;
    private int[] scores;
    private int numScores;
    public QuizGradeBook(){
        scores = new int[MAX_QUIZZES];
        numScores = 0;
    }
    public void addScore(int score){
        scores[numScores] = score;
        numScores++;
    }
    public double avg(){
        int sum = 0;
        for(int i = 0; i<scores.length; i++){
            sum += scores[i];
        }
        return sum/(double)scores.length;
    }
}
