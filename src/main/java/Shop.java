import others.ISell;
import others.Item;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ISell {

    private List<Item> stock = new ArrayList<>();
    public void addItemToStock(Item item){
        this.stock.add(item);
    }
    public void removeItemToStock(Item item){
        this.stock.remove(item);
    }
    public List<Item> getStock() {
        System.out.println(stock);
        return stock;
    }

}
