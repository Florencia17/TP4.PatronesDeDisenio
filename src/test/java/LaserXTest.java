
import a.LaserX;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import a.Empleado;
import a.EmpleadoACargo;
import a.EmpleadoRegular;

public class LaserXTest {
    private final Empleado director = new EmpleadoACargo("Malacarne FLorencia ", 10000);
    private final Empleado gerente = new EmpleadoACargo("Malacarne Micaela", 10000);
    private final Empleado mandoMedio = new EmpleadoACargo("Garcia Karina", 10000);
    private final Empleado liderProyecto = new EmpleadoACargo("Garcia Silvana", 10000);
    private final Empleado empleadoRegular = new EmpleadoRegular("Garcia Martina", 10000);
    LaserX laserX = new LaserX(director);

    @Test
    public void calcularMontoSalarios(){
        director.agregarEmpleado(gerente);
        gerente.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(liderProyecto);
        liderProyecto.agregarEmpleado(empleadoRegular);

        assertEquals(50000, laserX.getTotalSalarios());


    }

}
