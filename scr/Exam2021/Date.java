package Exam2021;

import java.time.LocalDate;
import java.time.Period;

public class Date {

    LocalDate date;

    public Date(){
        this.date = LocalDate.now();
    }

    public Date(int year, int month, int day){
        this.date = LocalDate.of(year, month, day);
    }


    public static int dayDiff(Date d1, Date d2){
        Period period = Period.between(d1.date, d2.date);
        return Math.abs(period.getDays());
    }

    public int monthSince(Date d){
        Period period = Period.between(this.date, d.date);
        return Math.abs(period.getMonths());
    }

    public int yearSince(Date d){
        Period period = Period.between(this.date, d.date);
        return Math.abs(period.getYears());
    }

}
