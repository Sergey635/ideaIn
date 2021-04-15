package redmonkey.edu;

public class Main {

    public static int num(int n){
        String str = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }


        return sum;
    }

    public static void main(String[] args) {

        System.out.println(num(258));
    }
}
