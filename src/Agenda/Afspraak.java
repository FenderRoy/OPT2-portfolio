package Agenda;

import Generic.CompareFunctions;
import Helpers.Datum;
import formats.IFormat;
import people.Client;
import people.Zorgpartner;

import java.util.Arrays;

public class Afspraak implements Comparable<Afspraak> {

    private Client client;
    private Zorgpartner zorgpartner;
    Datum date;

    public Afspraak(Client client, Zorgpartner zorgpartner, String datum) {
        this.client = client;
        this.zorgpartner = zorgpartner;

        date = new Datum(datum);
    }

    public Client getClient() {
        return client;
    }

    public Zorgpartner getZorgpartner() {
        return zorgpartner;
    }

    public String getDatum(IFormat format) {
        return date.getDatum(format);
    }

    public int getDag() {
        return date.getDag();
    }

    public int getMaand() {
        return date.getMaand();
    }

    public int getJaar() {
        return date.getJaar();
    }


    @Override
    public int compareTo(Afspraak afspraak) {
        return CompareFunctions.compareToChain(this, afspraak, Arrays.asList(
                Afspraak::getJaar,
                Afspraak::getMaand,
                Afspraak::getDag,
                A -> A.getClient().getNaam(),
                A -> A.getZorgpartner().getNaam())
        );
    }
}
