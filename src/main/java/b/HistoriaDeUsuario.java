package b;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements Item{

    private final List<Item> items;

    public HistoriaDeUsuario(){
        this.items= new ArrayList<>();
    }

    @Override
    public int getHoras() {
        int horasHU= 0;
        for (Item x : items){
            horasHU+= x.getHoras();
        }
        return horasHU;
    }

    @Override
    public void agregarItem(Item item) {
        this.items.add(item);

    }
}
