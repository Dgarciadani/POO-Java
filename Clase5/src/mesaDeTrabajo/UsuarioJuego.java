package mesaDeTrabajo;

public class UsuarioJuego {
     private String nombre, clave;
     private Double puntaje = 0.0 ;
     private int nivel = 0;

     public UsuarioJuego(String nombre,String clave){
          this.nombre = nombre;
          this.clave = clave;

     }
     public void aumentarPuntaje(){
          puntaje++;
     }
     public void subirNivel(){
          nivel++;
     }
     public void bonus(int valor){
          puntaje+=valor;
     }

     public String getNombre() {
          return nombre;
     }

     public String getClave() {
          return clave;
     }

     public Double getPuntaje() {
          return puntaje;
     }

     public int getNivel() {
          return nivel;
     }
}
