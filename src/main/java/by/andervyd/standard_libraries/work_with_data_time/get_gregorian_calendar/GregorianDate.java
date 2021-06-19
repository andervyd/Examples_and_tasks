package by.andervyd.standard_libraries.work_with_data_time.get_gregorian_calendar;

import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianDate {
    public static void main(String[] args) {

        Date date = new Date();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        System.out.println("Year: " + calendar.get(calendar.YEAR));
        System.out.println("Month: " + calendar.get(calendar.MONTH));
        System.out.println("Day: " + calendar.get(calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(calendar.MINUTE));
        System.out.println("Second: " + calendar.get(calendar.SECOND));

        // >>   Year: 2021
        //      Month: 5
        //      Day: 20
        //      Hour: 2
        //      Minute: 40
        //      Second: 35
    }
}
