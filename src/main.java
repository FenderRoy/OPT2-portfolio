import people.Client;
import people.Dichtbijzijnde;
import people.Zorgpartner;

public class main {

    public static void main(String[] args){


        Client Art = new Client("Art", "Floridastreet 5", "0612345678");
        Client Kennington = new Client("Kennington", "RoshesterStreet 12", "0687654321");

        Dichtbijzijnde Hans = new Dichtbijzijnde("Hans", "randomstraatnaam 82", "5872352351");
        Hans.setClient(Kennington);

        Zorgpartner Rosa = new Zorgpartner("Rosa", "zorgpartnerstraat 1", "1223124124");


        Agenda agenda = new Agenda();
        agenda.nieuweAfspraak("01/08", Art, Rosa);
        agenda.nieuweAfspraak("07/08", Art, Rosa);
        agenda.nieuweAfspraak("01/04", Kennington, Rosa);
        agenda.nieuweAfspraak("01/06", Kennington, Rosa);
        agenda.nieuweAfspraak("05/08", Kennington, Rosa);
        agenda.nieuweAfspraak("01/01", Kennington, Rosa);

        agenda.nieuweAfspraak("07/10", Kennington, Rosa);

        agenda.printAfspraken();



    }

}
