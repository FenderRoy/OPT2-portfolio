import java.util.ArrayList;

public class ConsolePrinter extends Printer {

    @Override
    public void printAfspraak(Afspraak afspraak){
        System.out.println("Client: "+afspraak.getClient().getNaam()+"\n" +
                "Zorgpartner: "+afspraak.getZorgpartner().getNaam()+"\n" +
                "Datum: "+afspraak.getDatum()+"\n");
    }

    @Override
    public void printAgenda(ArrayList<Afspraak> afspraken){
        for(Afspraak afspraak : afspraken){
            printAfspraak(afspraak);
        }
    }

}
