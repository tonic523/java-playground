package calendar;

import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Schedule {

    public Util util = new Util();

    public Schedule(){
    }

    public void add(String date, String schedule){
        String fDate = util.formatDate(date);
        File file = new File(String.format("/Users/wooseok/IdeaProjects/java-playground/schedules/%s.txt", fDate));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(schedule+"\n");
            writer.flush();
            writer.close();
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void read(String date) {
        String fDate = util.formatDate(date);
        try {
            FileReader file = new FileReader(
                    String.format("/Users/wooseok/IdeaProjects/java-playground/schedules/%s.txt", fDate));
            BufferedReader reader = new BufferedReader(file);
            String line = null;
            int number = 1;
            while ((line = reader.readLine()) != null) {
                System.out.printf("%d. %s\n",number, line);
                number ++;
            }
            reader.close();
            file.close();
        } catch (IOException e) {
            System.out.println("일정이 없습니다.");
        }
    }

    public boolean exist(String date) {
        String fDate = util.formatDate(date);
        try {
            FileReader file = new FileReader(
                    String.format("/Users/wooseok/IdeaProjects/java-playground/schedules/%s.txt", fDate));
            file.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}