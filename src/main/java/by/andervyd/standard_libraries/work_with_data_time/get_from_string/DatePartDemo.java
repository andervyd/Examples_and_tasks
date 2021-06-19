package by.andervyd.standard_libraries.work_with_data_time.get_from_string;

import java.util.Date;

public class DatePartDemo {
    public static void main(String[] args) {

        Date currentDate = new Date();
        DatePart date = new DatePart(currentDate);

        int month = date.getMonth();
        System.out.println("Now " + month + " month");
        // >> Now 6 month
    }
}
