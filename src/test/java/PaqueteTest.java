import c.Paquete;
import c.Seguro;
import c.Servicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaqueteTest {

    private Paquete paquete1;
    private Servicio hogar, automovil, vida, medicos;

    @BeforeEach
    public void hacerSetUp() {

        hogar = new Seguro(10);
        automovil= new Seguro(10);
        vida= new Seguro(10);
        medicos= new Seguro(10);

        paquete1 = new Paquete();
        
    }

    @Test

    public void calcularPrecioPaquete(){

        paquete1.agregarSeguro(hogar);
        paquete1.agregarSeguro(vida);

        assertEquals(19, paquete1.getCosto());
    }



}


