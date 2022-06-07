package formats;

import java.time.Month;

public class EuropeanWrittenFormat implements IFormat{
    @Override
    public String dateToString(int day, int month, int year) {
        return day+" "+ Month.of(month)+" "+year;
    }
}
