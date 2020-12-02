package dssc.assignment.cribbage;

public class CardParser {
    public static Card parseCard(String cardAsText) {
        if (cardAsText.equals("JS"))
            return new Card("JS");
        else return new Card("");
    }
}
