package calendar;

import java.util.ArrayList;
import java.util.HashMap;

public class Schedule {
    HashMap<String, ArrayList<String>> schedules = new HashMap<String,ArrayList<String>>();

    public Schedule(){}

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
