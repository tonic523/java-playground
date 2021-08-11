package calendar;

import java.util.regex.Pattern;

public class Util {
    String DATE = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
    public Util(){}

    public boolean isDate(String date){
        boolean regex = Pattern.matches(DATE, date);
        return regex;
    }

    public String formatDate(String date){
        String[] dateSplit = date.split("-");
        String year = dateSplit[0];
        String month = dateSplit[1];
        String day = dateSplit[2];
        return String.format("%s-%2s-%2s",year,month,day).replace(" ", "0");
    }
}
