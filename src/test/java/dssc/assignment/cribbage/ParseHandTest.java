package dssc.assignment.cribbage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParseHandTest {

    private String test;

    @Test
    void parseOneCard() {
        Card card = CardParser.parseCard("5H");
        assertAll(
                () -> assertEquals("5", card.rank()),
                () -> assertEquals(Suite.HEART, card.suite())
        );
    }
}
