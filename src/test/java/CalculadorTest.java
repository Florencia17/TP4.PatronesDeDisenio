import d.Calculador;
import d.CalculadorJubilado;
import d.CalculadorNoJubilado;
import org.junit.jupiter.api.Test;
import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class CalculadorTest {

    @Test
    public void jubiladoSinPromocion(){
        Calculador calculador = new CalculadorJubilado(now().getMonth().getValue() - 1);

        assertEquals(110, calculador.calcularPrecio(100));
    }


    @Test
    public void jubiladoConPromocion(){
        Calculador calculador= new CalculadorJubilado(now().getMonth().getValue());

        assertEquals(100, calculador.calcularPrecio(100));
    }

    @Test
    public void noJubiladoSinPromocion(){
        Calculador calculador = new CalculadorNoJubilado(now().getMonth().getValue() - 1);

        assertEquals(121, calculador.calcularPrecio(100));
    }

    @Test
    public void noJubiladoConPromocion(){
        Calculador calculador= new CalculadorNoJubilado(now().getMonth().getValue());

        assertEquals(115, calculador.calcularPrecio(100));
    }



}
