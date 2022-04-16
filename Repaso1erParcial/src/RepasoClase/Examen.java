package RepasoClase;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private double nota;
    private Alumno alumno;

    public boolean estaAprobado(){
        return nota>=4;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public double getNota() {
        return nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}

