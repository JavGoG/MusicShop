package instruments;

public class Violin extends Instrument implements IPlay{
    private String sound;
    private final String maker;
    public Violin(String material, String colour, String type, String maker) {
        super(material, colour, type);
        this.maker = maker;
    }

    @Override
    public String play() {
        return this.sound;
    }
}
