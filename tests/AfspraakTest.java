import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfspraakTest {

    @Test
    void testDatum(){

        Afspraak afspraak = new Afspraak(null, null, "05/12");

        assertEquals(afspraak.getDag(), 5);
        assertEquals(afspraak.getMaand(), 12);
    }

}