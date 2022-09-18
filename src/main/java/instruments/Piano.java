package instruments;

public class Piano extends Instrument {
    private String maker;
    public Piano(String material, String colour, String type, String maker) {
        super(material, colour, type);
        this.maker = maker;
    }
}
