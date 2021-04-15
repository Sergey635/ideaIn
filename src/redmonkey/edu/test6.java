package redmonkey.edu;

import java.util.StringTokenizer;

public class test6 {
    public static void main(String[] args) {
        String firstName = "Иван";
        String lastName = "Иванов";
        String secondName = "Петрович";
        char chartFirstName = lastName.charAt(0);
        String shortFirstName = String.valueOf(chartFirstName);

        char charSecondName = secondName.charAt(0);
        String shortSecondName = String.valueOf(charSecondName);

        System.out.println(lastName  + " " + shortFirstName + "." + " " + shortSecondName + ".");




    }
}
