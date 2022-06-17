package Agenda;

import Generic.CompareFunctions;
import Datums.IDatum;
import Datums.StringDatumAdapter;
import formats.IFormat;
import people.Client;
import people.Zorgpartner;

import java.util.Arrays;

public class Afspraak implements Comparable<Afspraak> {

    private Client client;
    private Zorgpartner zorgpartner;
    private IDatum datum;

    public Afspraak(Client client, Zorgpartner zorgpartner, String datum) {
        this.client = client;
        this.zorgpartner = zorgpartner;
        this.datum = new StringDatumAdapter(datum);
    }

    public Client getClient() {
        return client;
    }

    public Zorgpartner getZorgpartner() {
        return zorgpartner;
    }

    public IDatum getDatum() {
        return datum;
    }

    @Override
    public int compareTo(Afspraak afspraak) {
        return CompareFunctions.compareToChain(this, afspraak, Arrays.asList(
                A -> A.getDatum().getDag(),
                A -> A.getDatum().getMaand(),
                A -> A.getDatum().getJaar(),
                A -> A.getClient().getNaam(),
                A -> A.getZorgpartner().getNaam())
        );
    }
}
