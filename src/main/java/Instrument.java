import java.util.ArrayList;
import java.util.List;

public class Instrument extends Item{
    private String name;
    private String material;
    private String colour;
    private String type;
    private List<Instrument> instruments = new ArrayList<>();

    public Instrument(String name, String material, String colour, String type) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
    public void addInstrumentToList (Instrument instrument){
        this.instruments.add(instrument);
    }
}
