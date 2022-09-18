package others;

import java.util.ArrayList;
import java.util.List;

public class Item implements ISell {
    private int priceOfPurchase;
    private int priceForSell;
    private List<Item> item = new ArrayList<>();
    public void addItemToList(Item item){
        this.item.add(item);
    }
    public void removeItemToList(Item item){
        this.item.remove(item);
    }

}
