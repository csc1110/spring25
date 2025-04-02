package wk10.practicea;

public class QuizGradeBook {
    private int[] quizzes;
    private int numQuizzes;
    public QuizGradeBook(int maxQuizzes){
        this.quizzes = new int[maxQuizzes];
        numQuizzes = 0;
    }
    public void addQuiz(int score){

        if(numQuizzes < quizzes.length){
            quizzes[numQuizzes] = score;
            numQuizzes++;
        }

    }
    public int getNumQuizzes(){
        return numQuizzes;
    }
    public double getAverage(){
        int sum = 0;
        for(int i = 0; i < numQuizzes; i++){
            sum += quizzes[i];
        }
        return sum/(double)numQuizzes;
    }
    public int getLowest(){

        int min = quizzes[0];
        for(int i = 0; i < numQuizzes; i++){
            if(quizzes[i] < min){
                min = quizzes[i];
            }
        }
        return min;
    }
}
