package formats;

import java.util.Scanner;

public class UnitedStatesFormat implements IFormat{
    @Override
    public String dateToString(int day, int month, int year) {
        return month+"-"+day+"-"+year;
    }

    @Override
    public String getNaamFormat(String naam) {
        Scanner scanner = new Scanner(naam);
        String voornaam = scanner.next();
        String achternaam = "";
        if(scanner.hasNext()) achternaam = scanner.nextLine().substring(1);
        if(!achternaam.equals("")) return achternaam + ", "+voornaam;
        return voornaam;
    }

    @Override
    public String getLanguageName() { return "english"; }
}
