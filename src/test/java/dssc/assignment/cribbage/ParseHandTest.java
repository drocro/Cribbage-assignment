package dssc.assignment.cribbage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParseHandTest {

    @ParameterizedTest
    @CsvSource({"5,HEART", "J,SPADES"})
    void parseOneCard(String rank,String suite){
        Card card = CardParser.parseCard(new StringBuilder().append(rank.charAt(0)).append(suite.charAt(0)).toString());
        assertAll(
                () -> assertEquals(rank, card.getRank()),
                () -> assertEquals(suite, card.getSuite().toString())
        );
    }

    @Test
    void rank_to_string(){
        assertAll(
                () -> assertEquals("Ace", CardParser.covert_rank_to_string('A')),
                () -> assertEquals("9", CardParser.covert_rank_to_string('9'))
        );
    }





}
