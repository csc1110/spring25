package wk10.sectiona;

public class QuizGradeBook {
    private static final int MAX_QUIZZES = 5;
    private final int[] quizzes;
    private int numQuizzes;

    public QuizGradeBook(){
        //quizzes = new int[MAX_QUIZZES];
        //numQuizzes = 0;
        this(new int[MAX_QUIZZES]);
    }
    public QuizGradeBook(int[] scores){
        quizzes = scores;
        numQuizzes = 0;
    }
    public void addQuiz(int score){
        if(numQuizzes < quizzes.length) {
            quizzes[numQuizzes] = score;
            numQuizzes++;
        }
    }
    public int getNumQuizzes(){
        return numQuizzes;
    }
    public double getAverage(){
        double avg = 0;
        for(int i = 0; i<numQuizzes; i++){
            avg += quizzes[i];
        }
        avg = avg / numQuizzes;
        return avg;
    }
    public int getLowest(){
        int min = quizzes[0];
        for(int i = 0; i<numQuizzes; i++){
            if(quizzes[i] < min){
                min = quizzes[i];
            }
        }
        return min;
    }


}
