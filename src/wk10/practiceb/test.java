package wk10.practiceb;

public class test {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 42;
        nums[2] = -1;

        int l1[] = new int[1];
        int l2[] = new int[1];
        int l3[] = l1;

        l1[0] = 4;
        l3[0] = 2;

        System.out.println(l1[0]);
        System.out.println(l2[0]);
        System.out.println(l3[0]);
    }
}
