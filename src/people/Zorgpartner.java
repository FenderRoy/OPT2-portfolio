package people;

import java.util.ArrayList;

public class Zorgpartner extends Persoon {



    ArrayList<Client> cliënten;

    public Zorgpartner(String naam, String adress, String telefoonNummer) {
        super(naam, adress, telefoonNummer);
    }

    public ArrayList<Client> getCliënten() {
        return cliënten;
    }

    public void addClient(Client client){
        this.cliënten.add(client);
    }
}
