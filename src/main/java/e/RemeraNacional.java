package e;

public class RemeraNacional extends Remera{

    public RemeraNacional(double precioUnitario){
        super(precioUnitario);
    }
    @Override
    protected double calcularRecargo(double precioUnitario){
        return (precioUnitario * 0.015) ;
    }
    @Override
    protected double calcularBonificaciones(double precioUnitario){
        return (precioUnitario * 0.2);
    }
    @Override
    protected double calcularAumentoComercio(double precioUnitario){
        return (precioUnitario * 0.15);
    }
}
