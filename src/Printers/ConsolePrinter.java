package Printers;

import Agenda.Afspraak;
import formats.IFormat;

import java.util.ArrayList;

public class ConsolePrinter extends Printer {

    @Override
    public void printAfspraak(Afspraak afspraak, IFormat format){
        System.out.println("Client: "+afspraak.getClient().getNaam()+"\n" +
                "Zorgpartner: "+afspraak.getZorgpartner().getNaam()+"\n" +
                "Helpers.Datum: "+afspraak.getDatum(format)+"\n");
    }

    @Override
    public void printAgenda(ArrayList<Afspraak> afspraken, IFormat format){
        for(Afspraak afspraak : afspraken){
            printAfspraak(afspraak, format);
        }
    }

}
