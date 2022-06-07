package formats;

import java.time.Month;

public class UnitedStatesWrittenFormat implements IFormat{
    @Override
    public String dateToString(int day, int month, int year) {
        return Month.of(month)+" "+day+", "+year;
    }
}
