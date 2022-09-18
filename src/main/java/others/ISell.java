package others;

public interface ISell {
    default int calculateMarkup(int buyingPrice, int sellingPrice) {
        return buyingPrice-sellingPrice;
    }
}
