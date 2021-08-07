package calendar;

import java.util.Arrays;

public class Calendar {

    public String[] WEEKDAYS = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
    public Calendar(){}

    public boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 != 0){
                return true;
            }
            if (year % 400 == 0){
                return true;
            }
        }
        return false;
    }

    public int getTotalDays(int year, int month){
        int totalDays = 0;
        for (int i = 1; i <= year; i++){
            if (i == year){
                for (int m = 1; m < month; m++){
                    totalDays += getDays(year, m);
                }
                break;
            }
            if (isLeapYear(year)){
                totalDays += 366;
            }else{
                totalDays += 365;
            }
        }
        return totalDays;
    }

    public int getDays(int year, int month){
        if (month % 2 == 1 | month == 8){
            return 31;
        }else {
            if (month != 2){
                return 30;
            }else {
                if (isLeapYear(year)){
                    return 29;
                }else {
                    return 28;
                }
            }
        }
    }

    public void print(int days, String weekday){
        int weekday_num = Arrays.asList(WEEKDAYS).indexOf(weekday);
        System.out.printf("%2s %2s %2s %2s %2s %2s %2s\n","일","월","화","수","목","금","토");
        System.out.println("--------------------");
        for (int j = 1; j <= weekday_num; j++){
            System.out.printf("%2s ", "");
        }
        for (int i = 1; i <= days; i++){
            System.out.printf("%2d ",i);
            if (i % 7 == 7-weekday_num){
                System.out.println();
            }
        }
        System.out.println();
    }
}
