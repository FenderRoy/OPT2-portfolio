package Printers;

import Agenda.Afspraak;
import Generic.ConsoleWriter;
import Generic.LanguageController;
import formats.IFormat;

import java.util.ArrayList;
import java.util.Arrays;
public class ConsolePrinter extends Printer {

    public ConsolePrinter(IFormat format){
        super(format);
    }

    @Override
    public void printAfspraak(Afspraak afspraak){
        ArrayList<String> keywords = LanguageController.getLanguage(getFormat().getLanguageName());
        ConsoleWriter.printVariableList(keywords, afspraak, Arrays.asList(
                A -> getFormat().getNaamFormat(A.getClient().getNaam()),
                A -> getFormat().getNaamFormat(A.getZorgpartner().getNaam()),
                A -> A.getDatum().getString(getFormat())
        ));
    }

    @Override
    public void printAgenda(ArrayList<Afspraak> afspraken){
        for(Afspraak afspraak : afspraken){
            printAfspraak(afspraak);
        }
    }

}