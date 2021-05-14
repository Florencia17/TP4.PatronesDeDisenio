package b;

public class TareaSpike implements Item{

    private final int horas;

    public TareaSpike(int horas){
        this.horas= horas;
    }

    @Override
    public int getHoras() {
        return horas;
    }

    @Override
    public void agregarItem(Item item) {
        throw new RuntimeException("Error!");
    }
}
