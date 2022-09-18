package others;

public class DrumSticks extends Item {
    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public DrumSticks(String material, String colour, String type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    private String material;
    private String colour;
    private String type;
}
