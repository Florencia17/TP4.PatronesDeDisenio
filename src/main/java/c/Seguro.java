package c;

public class Seguro implements Servicio{

    private double precio;

    public Seguro(double precio){
        this.precio= precio;
    }

    @Override
    public double getCosto() {
        return precio;
    }
}
