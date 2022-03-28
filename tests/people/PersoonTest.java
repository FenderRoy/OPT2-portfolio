package people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersoonTest {

    @Test
    void testCreatePerson(){
        Persoon nieuwPersoon = new Dichtbijzijnde("Hans", "Teststraat 5", "0612345678");

        assertEquals(nieuwPersoon.getNaam(), "Hans");
        assertEquals(nieuwPersoon.getAdress(), "Teststraat 5");
        assertEquals(nieuwPersoon.getTelefoonNummer(), "0612345678");
    }

}