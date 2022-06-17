import Agenda.Afspraak;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfspraakTest {

    @Test
    void testDatum(){

        Afspraak afspraak = new Afspraak(null, null, "05/12");

        assertEquals(afspraak.getDatum().getDag(), 5);
        assertEquals(afspraak.getDatum().getMaand(), 12);
    }

}