package a;

public class EmpleadoRegular extends Empleado {

    private final String nombre;
    private final double salario;

    public EmpleadoRegular(String nombre, double salario){
        this.nombre= nombre;
        this.salario= salario;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        throw new RuntimeException("Error!");
    }
}
