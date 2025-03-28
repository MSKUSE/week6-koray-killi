public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int month, int year, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public String toString() {
        String dayStr = String.valueOf(day);
        String monthStr = String.valueOf(month);
        String yearStr = String.valueOf(year);
        return dayStr +"-"+monthStr+"-"+yearStr;
    }
}
