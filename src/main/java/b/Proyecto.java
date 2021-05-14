package b;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private final List<Item> items;

    public Proyecto(){
        this.items= new ArrayList<>();
    }

    public int obtenerHoras(){
        int horas= 0;
        for (Item i : items){
            horas+= i.getHoras();
        }
        return horas;
    }

    public void agregarItem(Item item){
        items.add(item);
    }
}
