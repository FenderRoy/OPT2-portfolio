package formats;

public class NederlandsFormat implements IFormat{
    @Override
    public String dateToString(int day, int month, int year) {
        return new EuropeanFormat().dateToString(day,month,year);
    }

    @Override
    public String getNaamFormat(String naam) {
        return new EuropeanFormat().getNaamFormat(naam);
    }

    @Override
    public String[] getKeywords() {
        return new String[]{"Client","Zorgpartner","Datum"};
    }
}
