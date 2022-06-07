package formats;

public interface IFormat {

    String dateToString(int day, int month, int year);

    String getNaamFormat(String naam);

    String[] getKeywords();

}
