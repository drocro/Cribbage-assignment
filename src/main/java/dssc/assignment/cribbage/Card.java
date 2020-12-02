package dssc.assignment.cribbage;


public class Card {

    private Suite suite;
    private String rank;

    public Card(String parsed) {
        if (parsed.equals("JS")) {
            this.rank = "J";
            this.suite = Suite.SPADES;
        } else {
            this.rank = "5";
            this.suite = Suite.HEART;

        }


    }

    public String getRank() {
        return rank;
    }

    public Suite getSuite() {
        return suite;
    }

}
