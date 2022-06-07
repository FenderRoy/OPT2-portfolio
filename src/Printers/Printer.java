package Printers;

import Agenda.Afspraak;
import Agenda.Agenda;
import formats.IFormat;
import people.Persoon;

import java.util.ArrayList;

public abstract class Printer {

    public abstract void printAfspraak(Afspraak afspraak, IFormat format);

    public void printAgenda(Agenda agenda, IFormat format){
        printAgenda(agenda.getAfspraken(), format);
    }

    public void printAgenda(Agenda agenda, IFormat format, int maand){
        printAgenda(agenda.getAfspraken(maand), format);
    }

    public void printAgenda(Agenda agenda, IFormat format, Persoon persoon){
        printAgenda(agenda.getAfspraken(persoon), format);
    }

    public abstract void printAgenda(ArrayList<Afspraak> afspraken, IFormat format);

}
