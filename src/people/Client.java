package people;

public class Client extends Persoon {

    private Zorgpartner zorgpartner;

    public Client(String naam, String adress, String telefoonNummer) {
        super(naam, adress, telefoonNummer);
    }

    public Zorgpartner getZorgpartner() {
        return zorgpartner;
    }

    public void setZorgpartner(Zorgpartner zorgpartner) {
        this.zorgpartner = zorgpartner;
    }
}
