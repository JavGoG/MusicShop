package instruments;

import others.Item;

import java.util.ArrayList;
import java.util.List;

public class Instrument extends Item {
    private String material;
    private String colour;
    private String type;
    private List<Instrument> instruments = new ArrayList<>();

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public Instrument(String material, String colour, String type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
    public void addInstrumentToList (Instrument instrument){
        this.instruments.add(instrument);
    }
}
