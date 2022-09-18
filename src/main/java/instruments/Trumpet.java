package instruments;

public class Trumpet extends Instrument{
    private final int numberOfValves;
    private final String maker;
    public Trumpet(String material, String colour, String type, int numberOfValves, String maker) {
        super(material, colour, type);
        this.numberOfValves = numberOfValves;
        this.maker = maker;
    }
}
