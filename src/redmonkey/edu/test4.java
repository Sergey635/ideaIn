package redmonkey.edu;

import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int[] array = {21, 45, 334, 556, 6645, 321, 4, 414};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        System.out.println(min);
        System.out.println(max);
    }
}
