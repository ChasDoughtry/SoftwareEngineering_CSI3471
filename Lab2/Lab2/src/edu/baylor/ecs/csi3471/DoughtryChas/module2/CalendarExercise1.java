package edu.baylor.ecs.csi3471.DoughtryChas.module2;

import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class CalendarExercise1 {
    public static void printDate(Calendar date){

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String formatted = format1.format(date.getTime());
        System.out.println(formatted);
    }
    public static void test() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH,-2);
        printDate(cal);
        cal.add(Calendar.MONTH,2);
        printDate(cal);

    }

    public static void main(String[] args) {
        test();
    }
}
