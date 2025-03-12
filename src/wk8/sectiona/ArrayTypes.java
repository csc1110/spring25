package wk8.sectiona;

public class ArrayTypes {
    public static void main(String[] args) {
        int[] nums = new int[3];
        double[] values = new double[3];

        char[] letters = new char[3];
        System.out.println(letters[0]);
        letters[0] = 'r';
        letters[1] = '\n';
        letters[2] = '\u2608';

        boolean[] flags;
        flags = new boolean[4];
        System.out.println(flags[0]);
        flags[0] = true;
        if(flags[0] && flags[1] || flags[2]){
            while (flags[3]){

            }
        }

        //declare
        String[] words;
        //initialize our array
        words = new String[3];
        int numWords = 0;
        //assign values
        words[0] = "bar";
        numWords++;
        words[1] = "foo";
        numWords++;
        //words[2] = "bar";
        String target = "bar";
        int count = 0;
        for(int i = 0; i < numWords; i++){
            if(words[i].equals("bar")){
                count++;
            }
        }
        System.out.println(count);

        Point[] points = new Point[3];
        points[0] = new Point(0,0);
        points[1] = new Point(5 * Math.random(),
                5* Math.random());
        points[2] = new Point(5,5);
        Point testPoint = new Point(1,1);
        double[] dist = new double[3];

        //dist[0] = testPoint.dist(points[0]);
        for(int i = 0; i<points.length; i++){
            dist[i] = testPoint.dist(points[i]);
        }




        points[0].getX();











    }
}
