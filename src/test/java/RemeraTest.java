import e.Remera;
import e.RemeraImportada;
import e.RemeraNacional;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemeraTest {

    @Test
    public void calculoPrecioNacional() {
        Remera remeraNacional = new RemeraNacional(50);

        assertEquals(46.69, remeraNacional.getPrecio());
    }

    @Test
    public void calculoPrecioImporada() {
        Remera remeraImportada = new RemeraImportada(60);

        assertEquals(81.0, remeraImportada.getPrecio());
    }









}
