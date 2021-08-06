package calendar;

public class Calendar {
    int[] DAYSBYMONTH = {31,29,31,30,31,30,31,31,30,31,30,31};
    public Calendar(){}

    public int getDays(int month){
        if (month < 1 | month > 12){
            return 0;
        }
        return DAYSBYMONTH[month-1];
    }

    public void print(int days){
        System.out.printf("%2s %2s %2s %2s %2s %2s %2s\n","일","월","화","수","목","금","토");
        System.out.println("--------------------");
        for (int i = 1; i <= days; i++){
            System.out.printf("%2d ",i);
            if (i % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
