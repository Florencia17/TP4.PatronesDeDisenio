package e;

public abstract class Remera {

    private double precioUnitario;

    public Remera(double precioUnitario){
        this.precioUnitario= precioUnitario;
    }

    public double getPrecio(){
        double precio = this.precioUnitario;
        precio += calcularRecargo(this.precioUnitario);
        precio -= calcularBonificaciones(precio);
        return precio + calcularAumentoComercio(precio);
    }

    protected abstract double calcularRecargo(double precioUnitario);

    protected abstract double calcularBonificaciones(double precioUnitario);

    protected abstract double calcularAumentoComercio(double precioUnitario);


}
