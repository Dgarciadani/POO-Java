package MesaTrabajo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Perro {
    private boolean adopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;

    public Perro(boolean adopcion,String raza,String nombre,double peso, boolean tieneChip){
        this.adopcion=adopcion;
        this.raza=raza;
        this.nombre=nombre;
        this.peso=peso;
        this.tieneChip=tieneChip;
    };
    public Perro(boolean adopcion,String raza,String nombre,double peso, boolean tieneChip,int anioNacimiento){
        this.adopcion=adopcion;
        this.raza=raza;
        this.nombre=nombre;
        this.peso=peso;
        this.tieneChip=tieneChip;
        this.anioNacimiento=anioNacimiento;
    };
    public Perro(boolean adopcion,String raza,double peso, boolean tieneChip,int anioNacimiento){
        this.adopcion=adopcion;
        this.raza=raza;
        this.peso=peso;
        this.tieneChip=tieneChip;
        this.anioNacimiento=anioNacimiento;
    };
    public int obtenerEdad(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY");
        int anioActual = java.lang.Integer.parseInt( formatoFecha.format(fecha));
        return anioActual- anioNacimiento;
    };
    public boolean puedePerderse(){
        return !tieneChip;
    };
    public boolean puedeAdoptarse(){
        if (!estaLastimado && peso>5.0) {
            return true;
        }else {
            return false;
        }
    }
}
