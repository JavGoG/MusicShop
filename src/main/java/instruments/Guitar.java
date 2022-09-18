package instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;
    private String maker;
    public Guitar(String material, String colour, String type, int numberOfStrings, String maker) {
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
        this.maker = maker;
    }
}
