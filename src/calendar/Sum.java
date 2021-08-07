package calendar;

public class Sum {
    int a;
    int b;

    public Sum(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Sum(String[] arr){
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[1]);
    }

    public void print(){
        System.out.printf("두 수의 합은 %d입니다.",(a + b));
    }

}
