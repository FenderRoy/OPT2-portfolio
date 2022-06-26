import Generic.CompareFunctions;
import people.Client;
import people.Zorgpartner;

import java.util.Arrays;

public class Afspraak implements Comparable<Afspraak> {

    private final Client client;
    private final Zorgpartner zorgpartner;
    IDatum datum;

    public Afspraak(Client client, Zorgpartner zorgpartner, String datumString) {
        this.client = client;
        this.zorgpartner = zorgpartner;

        datum = new StringDatumAdapter(datumString);
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
