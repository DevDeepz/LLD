package Comparabe;

import java.util.Collection;
import java.util.HashMap;

public class Inventory <T extends Item>{
    private HashMap<String,T> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    //addItem method
    public void addItem(T item) {
        if(items.containsKey(item.getId())) {
            System.out.println("Error: item with id" + item.getId() + "already Exist");
            return;
        }
        items.put((item.getId()),item);
    }
    //removeItem method
    public void removeItem(String id) {
        items.remove(id);
    }
    //getItem method
    public T getItem(String id){
        return items.get(id);
    }
    //getAllItems method
    public Collection<T> getAllItems(){
        return items.values();
    }
}
