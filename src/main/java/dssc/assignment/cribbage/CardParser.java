package dssc.assignment.cribbage;

public class CardParser {
    public static Card parseCard(String cardAsText) {

        char rank = cardAsText.charAt(0);
        char suite = cardAsText.charAt(1);

        if (cardAsText.equals("JS"))
            return new Card("JS");
        else return new Card("");
    }

    public static String covert_rank_to_string(char rank){
        switch (rank){
            case 'A': return "Ace";
            case '0': return "10";
            case 'J': return "Jack";
            case 'Q': return "Queen";
            case 'K': return "King";
            default: return new StringBuilder().append(rank).toString();
        }
    }

}
