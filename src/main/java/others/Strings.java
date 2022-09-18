package others;

import others.Item;

public class Strings extends Item {

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

    public Strings(String material, String colour, String type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
}
