import others.ISell;
import others.Item;

public class Shop implements ISell {

    public void sellItem(Item item){
        item.removeItemToList(item);
    }
}
