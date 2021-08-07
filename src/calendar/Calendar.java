package calendar;

import java.util.Arrays;

public class Calendar {
    Integer[] month_days_31 = {1,3,5,7,8,10,12};
    Integer[] month_days_30 = {4,6,9,11};

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

    public int getDays(int year, int month){
        int days;
        if (Arrays.asList(month_days_31).contains(month)){
            days = 31;
        }else if (Arrays.asList(month_days_30).contains(month)){
            days = 30;
        }else {
            days = isLeapYear(year) ? 29 : 28;
        }
        return days;
    }

    public int getWeekday(int year, int month, int day){
        // 1970년 1월 1일은 목요일
        int sYear = 1970;
        int standardWeekday = 3;
        int totalDays = 0;
        int weekdays;
        for (int i = sYear; i < year; i++){
            totalDays += isLeapYear(i) ? 366 : 355;
        }
        for (int m = 1; m < month; m++){
            totalDays += getDays(year,m);
        }
        totalDays += day;
        weekdays = (totalDays+standardWeekday) % 7;
        return weekdays;
    }

    public void print(int year, int month){
        int weekday = getWeekday(year,month,1);
        int days = getDays(year,month);
        System.out.printf("%2s %2s %2s %2s %2s %2s %2s\n","일","월","화","수","목","금","토");
        System.out.println("--------------------");
        for (int j = 1; j <= weekday; j++){
            System.out.printf("%2s ", "");
        }
        for (int i = 1; i <= days; i++){
            System.out.printf("%2d ",i);
            if ((i+weekday) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
