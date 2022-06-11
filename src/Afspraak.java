import people.Client;
import people.Zorgpartner;

public class Afspraak implements Comparable<Afspraak> {

    private Client client;
    private Zorgpartner zorgpartner;
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

    public String getDatum() {
        return datum.getDatum();
    }

    public int getDag() {
        return datum.getDag();
    }

    public int getMaand() {
        return datum.getMaand();
    }

    public int getJaar() {
        return datum.getJaar();
    }

    @Override
    public int compareTo(Afspraak afspraak) {
        if(getJaar() > afspraak.getJaar()){
            return 1;
        }
        if(getJaar() < afspraak.getJaar()){
            return -1;
        }
        if(getMaand() > afspraak.getMaand()){
            return 1;
        }
        if(getMaand() < afspraak.getMaand()){
            return -1;
        }
        if(getDag() > afspraak.getDag()){
            return 1;
        }
        if(getDag() < afspraak.getDag()){
            return -1;
        }
        return 0;
    }
}
