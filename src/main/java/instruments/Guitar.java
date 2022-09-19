package instruments;

public class Guitar extends Instrument implements IPlay {
    private final int numberOfStrings;
    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    private final String maker;
    public Guitar(String material, String colour, String type, int numberOfStrings, String maker) {
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                ", sound='" + sound + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }

    @Override
    public String play() {
        return this.sound;
    }
}
