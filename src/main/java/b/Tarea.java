package b;

public class Tarea implements Item{

    private final int horas;

    public Tarea(int horas){
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
