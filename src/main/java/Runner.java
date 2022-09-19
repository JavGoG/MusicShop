import instruments.Guitar;

public class Runner {
    static Shop shop = new Shop();
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Wood", "Brown", "guitar", 6, "LaGuitarra");
        guitar.setSound("gli, gli, gli, gligligli, gli");
        shop.addItemToStock(guitar);
        shop.getStock();

    }
}
