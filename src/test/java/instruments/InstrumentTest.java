package instruments;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InstrumentTest {
    Instrument instrument;
    @BeforeEach
    void before(){
        instrument = new Instrument("wood", "brown", "violin");
    }
    @org.junit.jupiter.api.Test
    void TestMaterial() {
        assertEquals("wood", instrument.getMaterial());
    }

    @org.junit.jupiter.api.Test
    void TestColour() {
        assertEquals("brown", instrument.getColour());
    }

    @org.junit.jupiter.api.Test
    void TestType() {
        assertEquals("violin", instrument.getType());
    }

    @org.junit.jupiter.api.Test
    void TestGetInstruments() {
        instrument.addInstrumentToList(instrument);
        assertEquals("[Instrument{material='wood', colour='brown', type='violin'}]", instrument.getInstruments());
    }

    @org.junit.jupiter.api.Test
    void TestAddInstrumentToList() {
        Instrument instrument1 = new Instrument("plastic", "white", "guitar");
        assertEquals(  true , instrument1.addInstrumentToList(instrument1));
    }
}