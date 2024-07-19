package exam02;

public class Schedule {
    int year;
    int month;
    int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int _year){
        year =_year;
    }
    public void setMonth(int _Month){
        month =_Month;
    }
    public void setDay(int _day){
       if(month == 2 && _day > 28 ) {
      _day = 28; }
        day =_day;}


    void showData(){
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }
}
