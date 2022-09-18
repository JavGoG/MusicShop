package instruments;

public class Violin extends Instrument {
    private final String maker;
    public Violin(String material, String colour, String type, String maker) {
        super(material, colour, type);
        this.maker = maker;
    }
}
