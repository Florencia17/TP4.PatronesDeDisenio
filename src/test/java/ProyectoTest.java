import b.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProyectoTest {

    private Item tareaA= new Tarea(1);
    private Item tareaB= new Tarea(1);
    private Item spikeA= new TareaSpike(1);
    Proyecto proyecto= new Proyecto();

    @Test
    public void calcularHorasProyecto(){

        Item historiaDeUsuario1 = new HistoriaDeUsuario();
        historiaDeUsuario1.agregarItem(tareaA);
        historiaDeUsuario1.agregarItem(tareaB);

        Item historiaDeUsuario2 = new HistoriaDeUsuario();
        historiaDeUsuario2.agregarItem(spikeA);

        proyecto.agregarItem(historiaDeUsuario1);
        proyecto.agregarItem(historiaDeUsuario2);

        assertEquals(3, proyecto.obtenerHoras());
    }

}
