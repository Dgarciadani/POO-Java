package RepasoClase;

public class Final extends Examen implements Comparable{
    private double notaOral;
    private String temaOral;

    @Override
    public boolean estaAprobado(){
        return (notaOral>=4&& getNota()>=4);
    }

    @Override
    public int compareTo(Object o) {
        Final comp=(Final)o;
        int resp=0;
        double promedioMio= (notaOral+getNota())/2;
        double promedioPara= (comp.notaOral+comp.getNota())/2;
        if(promedioMio > promedioPara){
            resp=  1;
        }
        else if(promedioMio< promedioPara){
             resp=  0;
        }
            }
}
