package calendar;

public class Calendar {
    public Calendar(){}

    public int isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 != 0){
                return 29;
            }
            if (year % 400 == 0){
                return 29;
            }
        }
        return 28;
    }

    public int getDays(int year, int month){
        if (month % 2 == 1 | month == 8){
            return 31;
        }else {
            if (month != 2){
                return 30;
            }else {
                return isLeapYear(year);
            }
        }
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
