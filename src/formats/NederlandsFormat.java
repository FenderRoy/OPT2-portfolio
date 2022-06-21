package formats;

public class NederlandsFormat implements IFormat{
    @Override
    public String dateToString(int day, int month, int year) {
        return new EuropeanFormat().dateToString(day,month,year);
    }

    @Override
    public String getNaamFormat(String naam) {
        return naam;
    }

    @Override
    public String getLanguageName() {
        return "nederlands";
    }

}
