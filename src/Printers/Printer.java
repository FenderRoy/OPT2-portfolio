package Printers;

import Agenda.Afspraak;
import Agenda.Agenda;
import formats.IFormat;
import people.Persoon;

import java.util.ArrayList;

public abstract class Printer {

    private IFormat format;

    public Printer(IFormat format){
        this.format = format;
    }

    public void setFormat(IFormat format) {
        this.format = format;
    }

    public IFormat getFormat() {
        return format;
    }

    public abstract void printAfspraak(Afspraak afspraak);

    public void printAgenda(Agenda agenda){
        printAgenda(agenda.getAfspraken());
    }

    public void printAgenda(Agenda agenda, int maand){
        printAgenda(agenda.getAfspraken(maand));
    }

    public void printAgenda(Agenda agenda, Persoon persoon){
        printAgenda(agenda.getAfspraken(persoon));
    }

    public abstract void printAgenda(ArrayList<Afspraak> afspraken);

}
