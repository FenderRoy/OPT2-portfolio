package formats;

public class EuropeanFormat implements IFormat{

    @Override
    public String dateToString(int day, int month, int year) {
        return day+"-"+month+"-"+year;
    }

    @Override
    public String getNaamFormat(String naam) {
        return naam;
    }

    @Override
    public String getLanguageName() { return "english"; }
}
