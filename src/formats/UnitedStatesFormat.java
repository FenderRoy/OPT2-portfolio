package formats;

public class UnitedStatesFormat implements IFormat{
    @Override
    public String dateToString(int day, int month, int year) {
        return month+"/"+day+"/"+year;
    }
}
