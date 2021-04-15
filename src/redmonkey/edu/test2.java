package redmonkey.edu;

public class test2 {

    public static int number(int n, String full){
        int counter = 0;

        for (int i = 0; i < full.length(); i++) {
            if (n == Integer.parseInt(String.valueOf(full.charAt(i)))) {
                counter++;
            }
        }


        return counter;
    }

    public static void main(String[] args) {
        System.out.println(number(4, "442158755745"));
    }
}
