package Printers;

import Agenda.Afspraak;
import formats.IFormat;

import java.util.ArrayList;

public class ConsolePrinter extends Printer {

    @Override
    public void printAfspraak(Afspraak afspraak, IFormat format){
        String[] keywords = format.getKeywords();
        System.out.println(keywords[0]+": "+format.getNaamFormat(afspraak.getClient().getNaam())+"\n" +
                keywords[1]+": "+format.getNaamFormat(afspraak.getZorgpartner().getNaam())+"\n" +
                keywords[2]+": "+afspraak.getDatum(format)+"\n");
    }

    @Override
    public void printAgenda(ArrayList<Afspraak> afspraken, IFormat format){
        for(Afspraak afspraak : afspraken){
            printAfspraak(afspraak, format);
        }
    }

}
