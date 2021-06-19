package by.andervyd.standard_libraries.work_with_data_time.leap_year;

import java.util.GregorianCalendar;

public class LeapYearDemo {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        for (int year = 1996; year <= 2021; year++) {
            if (calendar.isLeapYear(year)) {
                System.out.println("Year " + year + " is leap");
            }
        }
        // >>   Year 1996 is leap
        //      Year 2000 is leap
        //      Year 2004 is leap
        //      Year 2008 is leap
        //      Year 2012 is leap
        //      Year 2016 is leap
        //      Year 2020 is leap
    }
}
