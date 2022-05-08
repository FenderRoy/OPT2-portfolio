package people;

public class Contactpersoon extends Persoon {

    private Client client;

    public Contactpersoon(String naam, String adress, String telefoonNummer) {
        super(naam, adress, telefoonNummer);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
