package a;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoACargo extends Empleado {
    private final String nombre;
    private final double salario;
    private final List<Empleado> empleados;

    public EmpleadoACargo(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
        this.empleados= new ArrayList<>();
    }


    @Override
    public double getSalario() {
      double monto= 0;
      for (Empleado x : empleados){
          monto+= this.salario + x.getSalario();
      }
      return monto;
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
}
