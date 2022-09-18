package instruments;

public class Piano extends Instrument implements IPlay {
    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    private final String maker;
    public Piano(String material, String colour, String type, String maker) {
        super(material, colour, type);
        this.maker = maker;
    }

    @Override
    public String play() {
        return this.sound;
    }
}
