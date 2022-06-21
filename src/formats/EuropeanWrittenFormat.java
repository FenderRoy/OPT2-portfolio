package formats;

import java.time.Month;
import java.util.Locale;

public class EuropeanWrittenFormat implements IFormat{
    @Override
    public String dateToString(int day, int month, int year) {
        return day+" "+ Month.of(month).toString().toLowerCase()+", "+year;
    }

    @Override
    public String getNaamFormat(String naam) {
        return naam;
    }

    @Override
    public String getLanguageName() { return "english"; }
}
