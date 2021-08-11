package calendar;

import java.util.ArrayList;
import java.util.HashMap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Schedule {
    HashMap<String, ArrayList<String>> schedules = new HashMap<String,ArrayList<String>>();

    public Schedule(){}

    public String formatDate(String date){
        String[] dateSplit = date.split("-");
        String year = dateSplit[0];
        String month = dateSplit[1];
        String day = dateSplit[2];
        return String.format("%s-%2s-%2s",year,month,day).replace(" ", "0");
    }

    public void add(String date, String schedule){
        String fDate = formatDate(date);
        File file = new File(String.format("/Users/wooseok/IdeaProjects/java-playground/schedules/%s.txt", fDate));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(schedule);
            writer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList<String> read(String date, String schedule){
        ArrayList<String> schedules = new ArrayList<String>();

        return schedules;
    }

    public void delete(String date, String schedule){

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
