package wk8.sectionb;

public class ArrayTypes {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[3];

        double[] values = new double[5];

        char[] letters = new char[3];

        boolean[] flags = new boolean[2];

        //declare
        String[] words;
        //intializae
        words = new String[3];
        int numWords = 0;
        //assign
        words[0] = "bar";
        numWords++;
        words[1] = "foo";
        numWords++;
        //words[2] = "bar";
        String target = "bar";
        int count = 0;

        for(int i = 0; i < numWords; i++){
            if(words[i].equals(target)){
                count++;
            }
        }
        System.out.println(count);

        Point[] points = new Point[3];
        // set the first element to a point at (0,0)
        points[0] = new Point(0,0);
        points[1] = new Point(5 * Math.random(), 5 * Math.random());
        Point p1 = new Point(1,1);
        points[2] = p1;

        for(int i = 0; i < points.length; i++){
            System.out.println(points[i].getX());
            System.out.println(points[i].getY());
        }
    }
}
