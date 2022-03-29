import org.junit.jupiter.api.Test;
import people.Client;
import people.Zorgpartner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AgendaTest {


    //Testen op volgorde.
    @Test
    void testGetAfspraken() {

        Agenda agenda = new Agenda();

        Client client = new Client("client", "clientstraat", "0");
        Zorgpartner zorgpartner = new Zorgpartner("Zorgpartner", "zorgpartner", "0");

        Afspraak afspraak1 = new Afspraak(client, zorgpartner, "01/06");
        Afspraak afspraak2 = new Afspraak(client, zorgpartner, "04/06");
        Afspraak afspraak3 = new Afspraak(client, zorgpartner, "04/02");

        agenda.nieuweAfspraak(afspraak1);
        agenda.nieuweAfspraak(afspraak2);
        agenda.nieuweAfspraak(afspraak3);

        ArrayList<Afspraak> afspraken = agenda.getAfspraken();

        //Juiste volgorde
        assertEquals(afspraken.get(0), afspraak3 );
        assertEquals(afspraken.get(1), afspraak1 );
        assertEquals(afspraken.get(2), afspraak2 );


    }

    //Testen op maand
    @Test
    void testGetAfsprakenMaand() {

        Agenda agenda = new Agenda();

        Client client = new Client("client", "clientstraat", "0");
        Zorgpartner zorgpartner = new Zorgpartner("Zorgpartner", "zorgpartner", "0");

        Afspraak afspraak1 = new Afspraak(client, zorgpartner, "01/06");
        Afspraak afspraak2 = new Afspraak(client, zorgpartner, "04/06");
        Afspraak afspraak3 = new Afspraak(client, zorgpartner, "04/02");

        agenda.nieuweAfspraak(afspraak1);
        agenda.nieuweAfspraak(afspraak2);
        agenda.nieuweAfspraak(afspraak3);

        ArrayList<Afspraak> afspraken = agenda.getAfspraken(2);

        //Alleen in de 2e maand.
        assertEquals(afspraken.size(), 1);
        assertEquals(afspraken.get(0), afspraak3 );
    }

    @Test
    void testNieuweAfspraak() {

        Agenda agenda = new Agenda();

        Client client = new Client("Jan", "straatnaam", "0612345678");
        Zorgpartner zorgpartner = new Zorgpartner("Susan", "zorgpartnerstraat", "1687654321");

        agenda.nieuweAfspraak("06/01", client, zorgpartner);

        ArrayList<Afspraak> afspraken = agenda.getAfspraken();

        assertEquals(afspraken.size(), 1);
        assertEquals(afspraken.get(0).getMaand(), 01);
        assertEquals(afspraken.get(0).getDag(), 06);
        assertEquals(afspraken.get(0).getClient().getNaam(), client.getNaam());
        assertEquals(afspraken.get(0).getClient().getAdress(), client.getAdress());
        assertEquals(afspraken.get(0).getClient().getTelefoonNummer(), client.getTelefoonNummer());
        assertEquals(afspraken.get(0).getZorgpartner().getTelefoonNummer(), zorgpartner.getTelefoonNummer());
        assertEquals(afspraken.get(0).getZorgpartner().getAdress(), zorgpartner.getAdress());
        assertEquals(afspraken.get(0).getZorgpartner().getNaam(), zorgpartner.getNaam());

    }
}