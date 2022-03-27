package people;

public class Dichtbijzijnde extends Persoon {

    private Client client;

    public Dichtbijzijnde(String naam, String adress, String telefoonNummer) {
        super(naam, adress, telefoonNummer);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
