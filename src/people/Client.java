package people;

import java.util.ArrayList;

public class Client extends Persoon {

    private Zorgpartner zorgpartner;
    private ArrayList<Contactpersoon> dichtbijzijnden;

    public Client(String naam, String adress, String telefoonNummer) {
        super(naam, adress, telefoonNummer);
        dichtbijzijnden = new ArrayList<>();
    }

    public Zorgpartner getZorgpartner() {
        return zorgpartner;
    }

    public void setZorgpartner(Zorgpartner zorgpartner) {
        this.zorgpartner = zorgpartner;
    }

    public ArrayList<Contactpersoon> getDichtbijzijnden() {
        return dichtbijzijnden;
    }

    public void addDichtbijzijnde(Contactpersoon dichtbijzijnde){
        this.dichtbijzijnden.add(dichtbijzijnde);
    }
}
