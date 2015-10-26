package com.epam.module3.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by pxjok on 26.10.2015.
 */
public class CrazyLogger {
    private StringBuilder log = new StringBuilder();

    public void log(String message) {
        String date = getFormatedDate();
        log.append(date);
        log.append(" - ");
        log.append(message + ";\n");
    }

    public String getRecordsContainsString(String pattern) {
        StringBuilder res = new StringBuilder();
        int startIndex = 0;
        int endIndex = 0;
        String tmp;
        while (endIndex < log.length()) {
            endIndex = log.indexOf(";", startIndex) + 2;
            tmp = log.substring(startIndex, endIndex);
            startIndex = endIndex;

            if (tmp.contains(pattern)) {
                res.append(tmp);
            }
        }
        return res.toString();

    }


    public void printRecordsContainsString(String pattern){
        System.out.println(getRecordsContainsString(pattern));
    }

    public void printThisMonth(){
        System.out.println(getThisMonth());
    }

    public String getThisMonth(){
        Date date  = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MM");

        return getRecordsContainsString("-" + dateFormat.format(date) + "-");

    }

    public void print() {
        System.out.println(log);
    }

    private String getFormatedDate() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY : hh-mm");
        return dateFormat.format(date);
    }
}
