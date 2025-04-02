package wk10.sectionb;

public class QuizGradeBook {
    private static final int MAX_QUIZZES = 5;
    private final int[] quizzes;
    private int numQuizzes;

    public QuizGradeBook(int[] quizzes){
        this.quizzes = quizzes;
        numQuizzes = 0;
    }
    public QuizGradeBook(){
        //quizzes = new int[MAX_QUIZZES];
        //numQuizzes = 0;
        this(new int[MAX_QUIZZES]);
    }
    public void addQuiz(int score){
//        for(int i = 0; i < quizzes.length; i++){
//            if(quizzes[i] == 0){
//                quizzes[i] = score;
//                stop = true;
//            }
//        }
        quizzes[numQuizzes] = score;
        numQuizzes++;
    }
    public double getAverage(){
        int total = 0;
        for(int i = 0; i < quizzes.length; i++){
            total += quizzes[i];
        }
        return (double)total / quizzes.length;
    }

    public int getHighest(){
        int highest = quizzes[0];
        for(int i = 0; i < numQuizzes; i++){
            if(quizzes[i] > highest){
                highest = quizzes[i];
            }
        }
        return highest;
    }







}
