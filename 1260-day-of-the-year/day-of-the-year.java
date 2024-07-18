import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(day);
        int dayOfYear = 0;

        for(int i=0;i<month-1;i++){
            dayOfYear+=dayInMonth[i];
        }
        dayOfYear+=day;

        if(month>2 && year%4==0 && (year%100!=0 || year%400==0)){
            dayOfYear+=1;
        }

        return dayOfYear;
    }
}