import people.Client;
import people.Zorgpartner;

public class Afspraak implements Comparable<Afspraak> {

    private Client client;
    private Zorgpartner zorgpartner;
    private String datum;
    private int dag;
    private int maand;
    private int jaar;

    public Afspraak(Client client, Zorgpartner zorgpartner, String datum) {
        this.client = client;
        this.zorgpartner = zorgpartner;

        DatumConverter converter = new DatumConverter(datum);
        this.dag = converter.getDag();
        this.maand = converter.getMaand();
        this.jaar = converter.getJaar();
        this.datum = converter.getDatum("EU");
    }

    public Client getClient() {
        return client;
    }

    public Zorgpartner getZorgpartner() {
        return zorgpartner;
    }

    public String getDatum() {
        return datum;
    }

    public int getDag() {
        return dag;
    }

    public int getMaand() {
        return maand;
    }

    public int getJaar() {
        return jaar;
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
