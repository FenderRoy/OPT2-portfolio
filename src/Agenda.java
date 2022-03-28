import people.Client;
import people.Zorgpartner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Agenda {

    private ArrayList<Afspraak> afspraken;

    public Agenda(){
        afspraken = new ArrayList<>();
    }

    public ArrayList<Afspraak> getAfspraken(int maand) {
        sorteerAfspraken();

        ArrayList<Afspraak> nieuweAfspraken = new ArrayList<>();

        for(Afspraak afspraak : afspraken){
            if(afspraak.getMaand() == maand){
                nieuweAfspraken.add(afspraak);
            }
        }

        return nieuweAfspraken;

    }

    public ArrayList<Afspraak> getAfspraken() {
        sorteerAfspraken();
        return afspraken;
    }

    private void sorteerAfspraken(){

        Collections.sort(afspraken);

    }

    public void nieuweAfspraak(String datum, Client client, Zorgpartner zorgpartner){
        this.afspraken.add(new Afspraak(client, zorgpartner, datum));
    }

    public void nieuweAfspraak(Afspraak afspraak){
        this.afspraken.add(afspraak);
    }

    public void printAfspraken(){

        sorteerAfspraken();

        for(Afspraak afspraak : afspraken){
            afspraak.printAfspraakInformatie();
        }

    }

}

