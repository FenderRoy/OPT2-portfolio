import people.Client;
import people.Zorgpartner;

import java.util.Comparator;
import java.util.Scanner;

public class Afspraak implements Comparable<Afspraak> {

    private Client client;
    private Zorgpartner zorgpartner;
    private String datum;
    private int dag;
    private int maand;

    public Afspraak(Client client, Zorgpartner zorgpartner, String datum) {
        this.client = client;
        this.zorgpartner = zorgpartner;
        this.datum = datum;

        Scanner scanner = new Scanner(datum.replace("/", " "));
        this.dag = scanner.nextInt();
        this.maand = scanner.nextInt();
        scanner.close();
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

    public void printAfspraakInformatie(){
        System.out.println("Client: "+client.getNaam()+"\n" +
                "Zorgpartner: "+zorgpartner.getNaam()+"\n" +
                "Datum: "+datum+"\n");
    }

    @Override
    public int compareTo(Afspraak afspraak) {
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
