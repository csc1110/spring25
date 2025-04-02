package wk10.practiceb;

public class QuizGradeBook {
    private int[] quizzes;
    private int numQuizzes;

    public QuizGradeBook(int maxQuizzes){
        quizzes = new int[maxQuizzes];
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
        int total = 0;
        for(int i = 0; i<numQuizzes; i++){
            total += quizzes[i];
        }
        return (double)total/numQuizzes;
    }
    public int getLowest(){
        int lowest = quizzes[0];
        for(int i = 0; i < numQuizzes; i++){
            if(quizzes[i] < lowest){
                lowest = quizzes[i];
            }
        }
        return lowest;
    }


}
