package redmonkey.edu;

public class test3 {
    public static void main(String[] args) {
        int result = 0;
        int n = 5;
        for (int i = 20; i <= 45; i++) {
            if ( (i % 5) == 0){
                result += i;
                System.out.println(i);
            }
        }
        System.out.print(result);

    }
}
