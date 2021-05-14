package a;

public class LaserX {
    private Empleado empleado;

    public LaserX(Empleado director){
        this.empleado= director;
    }

    public double getTotalSalarios(){
        return empleado.getSalario();
    }

}
