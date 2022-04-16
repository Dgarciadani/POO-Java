package Academy;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OferaAcademica{
    private double porcentajeBonificacion;
    private List<OferaAcademica> list_ofertasAcademicas = new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double precioTotal = 0.0;
        for (OferaAcademica ofertasAcademica : list_ofertasAcademicas) {
            precioTotal+= ofertasAcademica.calcularPrecio();
        }
        return precioTotal*(1-porcentajeBonificacion);

    }
    public void agregarOfertaAcademica(OferaAcademica ofertasAcademica){
        list_ofertasAcademicas.add(ofertasAcademica);
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public List<OferaAcademica> getList_ofertasAcademicas() {
        return list_ofertasAcademicas;
    }

    public void setList_ofertasAcademicas(List<OferaAcademica> list_ofertasAcademicas) {
        this.list_ofertasAcademicas = list_ofertasAcademicas;
    }
}
