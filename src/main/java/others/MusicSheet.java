package others;

import others.Item;

public class MusicSheet extends Item {
    public MusicSheet(String material, String colour, String type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    private String material;
    private String colour;
    private String type;

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
