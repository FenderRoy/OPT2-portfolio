import people.Client;
import people.Contactpersoon;
import people.Zorgpartner;

import java.util.Date;

public class main {

    public static void main(String[] args){

        Client Art = new Client("Art", "Floridastreet 5", "0612345678");
        Client Kennington = new Client("Kennington", "RoshesterStreet 12", "0687654321");
        Client Jan = new Client("Jan", "straatnaam 102", "1234");
        Client Sander = new Client("Sander", "opdfjads 232", "52345324");

        Contactpersoon Hans = new Contactpersoon("Hans", "randomstraatnaam 82", "5872352351");
        Hans.setClient(Kennington);

        Zorgpartner Rosa = new Zorgpartner("Rosa", "zorgpartnerstraat 1", "1223124124");
        Zorgpartner Bob = new Zorgpartner("Bob", "zorgpartnerstraat 162", "4552345233");

        Agenda agenda = new Agenda();

        agenda.nieuweAfspraak("01/08/2023", Art, Bob);
        agenda.nieuweAfspraak("07/08", Art, Bob);
        agenda.nieuweAfspraak("01/04", Kennington, Rosa);
        agenda.nieuweAfspraak("01/06", Jan, Rosa);
        agenda.nieuweAfspraak("05/08/2023", Sander, Rosa);
        agenda.nieuweAfspraak("01/01", Kennington, Rosa);

        agenda.nieuweAfspraak("07/10", Jan, Bob);
        agenda.nieuweAfspraak("07/10", Kennington, Bob);


        Printer consolePrinter = new ConsolePrinter();

        consolePrinter.printAgenda(agenda);
    }

}
