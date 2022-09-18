package instruments;

public class Guitar extends Instrument {
    private final int numberOfStrings;
    private final String maker;
    public Guitar(String material, String colour, String type, int numberOfStrings, String maker) {
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
        this.maker = maker;
    }
}
