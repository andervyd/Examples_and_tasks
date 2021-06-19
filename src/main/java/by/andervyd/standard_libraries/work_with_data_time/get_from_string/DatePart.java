package by.andervyd.standard_libraries.work_with_data_time.get_from_string;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatePart {
    private Date fromDate;
    private SimpleDateFormat formatter;

    public DatePart(Date anyDate) {
        this.fromDate = anyDate;
        formatter = new SimpleDateFormat
                ("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
    }

    public int getDay() {
        formatter.applyPattern("d");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMonth() {
        formatter.applyPattern("M");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getYear() {
        formatter.applyPattern("y");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getHour() {
        formatter.applyPattern("h");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMinute() {
        formatter.applyPattern("m");
        return Integer.parseInt(formatter.format(fromDate));
    }
}
