package c;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements Servicio{

    private final List<Servicio> listaSeguros = new ArrayList<>();

    public void agregarSeguro(Servicio servicio){
        listaSeguros.add(servicio);
    }

    @Override
    public double getCosto() {
        double costo= 0;
        for (Servicio x : listaSeguros){
            costo+= x.getCosto() - (0.05* x.getCosto());
        }
        return costo;
    }


}
