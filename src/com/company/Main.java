package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import calendar.Calendar;
import calendar.Schedule;
import calendar.Util;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        Schedule schedule = new Schedule();
        Util myUtil = new Util();
        boolean isRun = true;
        String command;
        String date;
        String inSchedule;
        ArrayList<String> schedules = new ArrayList<String>();
        String buffer;
        calendar.help();
        while(isRun){
            System.out.println("명령 (1, 2, 3, h, q)");
            System.out.print("> ");
            command = scanner.nextLine();
            switch (command){
                case "1":
                    System.out.println("[일정 등록]");
                    System.out.println("[일정 등록] 날짜를 입력하세요.(yyyy-mm-dd)");
                    date = scanner.next();
                    buffer = scanner.nextLine();
                    if (!myUtil.isDate(date)){
                        System.out.println("날짜를 잘못 입력하셨습니다.");
                        break;
                    }
                    System.out.println("일정을 입력하세요.");
                    inSchedule = scanner.nextLine();
                    schedule.add(date, inSchedule);
                    break;
                case "2":
                    System.out.println("일정 조회");
                    System.out.println("[일정 조회] 날짜를 입력하세요.");
                    date = scanner.next();
                    buffer = scanner.nextLine();
                    if (!myUtil.isDate(date)){
                        System.out.println("날짜를 잘못 입력하셨습니다.");
                        break;
                    }
                    schedule.read(date);
                    break;
                case "3":
                    calendar.getCalendar(schedule);
                    break;
                case "h":
                    calendar.help();
                    break;
                case "q":
                    isRun = false;
                    System.out.println("bye~");
                    break;
            }
        }
    }
}