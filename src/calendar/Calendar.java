package calendar;

public class Calendar {
    int[] DAYSBYMONTH = {31,29,31,30,31,30,31,31,30,31,30,31};
    public Calendar(){}

    public int getDays(int month){
        return DAYSBYMONTH[month-1];
    }
}
