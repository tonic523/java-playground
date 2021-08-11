package calendar;

import java.util.regex.Pattern;

public class Util {
    String DATE = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
    public Util(){}

    public boolean isDate(String date){
        boolean regex = Pattern.matches(DATE, date);
        return regex;
    }
}
