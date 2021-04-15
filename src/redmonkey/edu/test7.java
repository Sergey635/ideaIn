package redmonkey.edu;

import java.util.Calendar;

public class test7 {
    static boolean isLeapYear(int year){
        Calendar calendar= Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2001));

    }
}
