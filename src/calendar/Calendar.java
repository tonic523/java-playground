package calendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Calendar {
    Integer[] month_days_31 = {1,3,5,7,8,10,12};
    Integer[] month_days_30 = {4,6,9,11};
    HashMap<String, ArrayList<String>> schedules = new HashMap<String,ArrayList<String>>();

    public Calendar(){}

    public void help() {
        System.out.println("+--------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+--------------+");
    }

    public void getCalendar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("연도를 입력하세요.");
        System.out.print("YEAR> ");
        int year = Integer.parseInt(scanner.next());
        if (year < 1970){
            System.out.println("연도를 잘못 입력하셨습니다.");
            return;
        }
        System.out.println("월을 입력하세요.");
        System.out.print("MONTH> ");
        int month = Integer.parseInt(scanner.next());
        if (month < 1 | month > 12){
            System.out.println("월을 잘못 입력하셨습니다.");
            return;
        }
        String buffer = scanner.nextLine();
        print(year, month);
    }

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
            totalDays += isLeapYear(i) ? 366 : 365;
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
        String date;
        System.out.printf("    <%4d년 %2d월>    \n", year, month);
        System.out.printf("%2s %2s %2s %2s %2s %2s %2s\n","일","월","화","수","목","금","토");
        System.out.println("--------------------");
        for (int j = 1; j <= weekday; j++){
            System.out.printf("%2s ", "");
        }
        for (int day = 1; day <= days; day++){
            date = String.format("%d-%d-%d",year,month,day);
            System.out.printf("%2d",day);
            if (schedules.containsKey((date))){
                System.out.print(".");
            }else{
                System.out.print(" ");
            }
            if ((day+weekday) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public void setSchedule(String date, String schedule){
        ArrayList<String> tempList = new ArrayList<>();
        if (schedules.containsKey(date)){
            tempList = schedules.get(date);
        }
        tempList.add(schedule);
        schedules.put(date, tempList);
    }

    public Object getSchedule(String date){
        ArrayList<String> tempList = new ArrayList<>();
        if (schedules.containsKey(date)){
            tempList = schedules.get(date);
            System.out.printf("%d개의 일정이 있습니다.\n", tempList.size());
        }else {
            System.out.println("일정이 없습니다.");
        }
        return tempList;
    }
}
