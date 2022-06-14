package Printers;

import Agenda.Afspraak;
import formats.IFormat;

import java.util.ArrayList;

public class ConsolePrinter extends Printer {

    public ConsolePrinter(IFormat format){
        super(format);
    }

    @Override
    public void printAfspraak(Afspraak afspraak){
        String[] keywords = getFormat().getKeywords();
        System.out.println(keywords[0]+": "+getFormat().getNaamFormat(afspraak.getClient().getNaam())+"\n" +
                keywords[1]+": "+getFormat().getNaamFormat(afspraak.getZorgpartner().getNaam())+"\n" +
                keywords[2]+": "+afspraak.getDatum().getString(getFormat())+"\n");
    }

    @Override
    public void printAgenda(ArrayList<Afspraak> afspraken){
        for(Afspraak afspraak : afspraken){
            printAfspraak(afspraak);
        }
    }

}
