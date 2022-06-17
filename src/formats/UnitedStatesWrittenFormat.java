package formats;

import java.time.Month;
import java.util.Scanner;

public class UnitedStatesWrittenFormat implements IFormat{
    @Override
    public String dateToString(int day, int month, int year) {
        return Month.of(month).toString().toLowerCase()+" "+day+", "+year;
    }

    @Override
    public String getNaamFormat(String naam) {
        return new UnitedStatesFormat().getNaamFormat(naam);
    }

    @Override
    public String[] getKeywords() {
        return new String[]{"Client","Caretaker","Date"};
    }
}
